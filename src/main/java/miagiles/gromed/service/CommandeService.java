package miagiles.gromed.service;

import lombok.extern.java.Log;
import miagiles.gromed.entity.Commande;
import miagiles.gromed.entity.Presentation;
import miagiles.gromed.entity.PresentationDeCommande;
import miagiles.gromed.entity.Utilisateur;
import miagiles.gromed.repository.CommandeRepository;
import miagiles.gromed.repository.PresentationCommandeRepository;
import miagiles.gromed.repository.UtilisateurRepository;
import miagiles.gromed.repository.PresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Log
public class CommandeService {
    @Autowired
    CommandeRepository commandeRepository;

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Autowired
    PresentationService presentationService;

    @Autowired
    PresentationRepository presentationRepository;

     @Autowired
    PresentationCommandeRepository presentationCommandeRepository;

    public Iterable<Commande> findAll(){

        return commandeRepository.findAll();
    }

    public void createCommande(Commande commande ) {
        try{


            commandeRepository.save(commande);

        }catch(Exception e){
            log.info("Creation failed");
        }

    }

    public Commande getPanier(String userMail) {
        Utilisateur user = utilisateurRepository.findByAdresseMail(userMail);
        Commande panier =null ;
        for(Commande cmd : user.getCommandes()){
            if(cmd.getEtatCommande().equals("panier")){
                panier=cmd;
            }
        }
        return panier;
    }

    public ArrayList<Integer> validerCommande(String userMail, boolean isForced) {
        String retour = "Commande validée";
        ArrayList<Integer> idPresentationManquante;
        idPresentationManquante = new ArrayList<Integer>();
        boolean isOnHold = false;

        Commande panier = getPanier(userMail);
        if(panier==null){
            return null;//erreur interne
        }
        List<PresentationDeCommande> listPresentationCommande =presentationCommandeRepository.findByPresentationCommande_Commande(panier.getNumeroCommande());

        //check ref manquantes
        if(!isForced)
        {
            for (PresentationDeCommande p : listPresentationCommande) {
                Presentation presentation = presentationService.getPresentationByCIP7(p.getPresentationCommande().getPresentation());
                if (presentation.getStockLogique() < p.getQuantite()) {
                    isOnHold = true;
                    idPresentationManquante.add((int) presentation.getCodeCIP7());
                }
            }
        }
        if(isOnHold)
        {
            return idPresentationManquante;
        }

        for(PresentationDeCommande p : listPresentationCommande)
        {
            Presentation presentation = presentationService.getPresentationByCIP7(p.getPresentationCommande().getPresentation());
            presentation.setStockLogique(presentation.getStockLogique() - p.getQuantite());
            presentationRepository.save(presentation);
        }
        panier.setEtatCommande("en cours");
        commandeRepository.save(panier);

        if(!idPresentationManquante.isEmpty())
        {
            retour = "Articles hors-stock";
        }
        return idPresentationManquante;
    }
}
