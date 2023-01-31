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
            if(cmd.getEtatCommande().equals("Panier")){
                panier=cmd;
            }
        }
        return panier;
    }

    public String validerCommande(String userMail) {

        Commande panier = getPanier(userMail);
        if(panier==null){
            return "Erreur";
        }
        List<PresentationDeCommande> listPresentationCommande =presentationCommandeRepository.findByPresentationCommande_Commande(panier.getNumeroCommande());

        for(PresentationDeCommande p : listPresentationCommande){

            Presentation presentation = presentationService.getPresentationByCIP7(p.getPresentationCommande().getPresentation());
            try {
                presentation.setStockLogique(presentation.getStockLogique()-p.getQuantite());
                presentationRepository.save(presentation);

            } catch(Exception e) {
                if(e.getMessage().equals("Le stock logique ne peut pas �tre inf�rieur � 0")) {
                    System.out.println("Impossible de diminuer le stock logique !");
                }
            }


        }
        panier.setEtatCommande("en cours");
        commandeRepository.save(panier);

        return "Commande validée";
    }
}
