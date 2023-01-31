package miagiles.gromed.service;

import lombok.extern.java.Log;
import miagiles.gromed.entity.Commande;
import miagiles.gromed.entity.Presentation;
import miagiles.gromed.entity.PresentationDeCommande;
import miagiles.gromed.entity.Utilisateur;
import miagiles.gromed.repository.CommandeRepository;
import miagiles.gromed.repository.PresentationRepository;
import miagiles.gromed.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Log
public class CommandeService {
    @Autowired
    CommandeRepository commandeRepoitory;

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Autowired
    PresentationService presentationService;

    @Autowired
    PresentationRepository presentationRepository;

    public Iterable<Commande> findAll(){
        return commandeRepoitory.findAll();
    }

    public void createCommande(Commande commande ) {
        try{

            commandeRepoitory.save(commande);

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
        for(PresentationDeCommande p : panier.getPresentations()){

            Presentation presentation = presentationService.getPresentationByCIP7(p.getPresentationCommande().getPresentation());
            try {
                presentation.setStockLogique(presentation.getStockLogique()-p.getQuantite());
                presentationRepository.save(presentation);

            } catch(Exception e) {
                if(e.getMessage().equals("Le stock logique ne peut pas être inférieur à 0")) {
                    System.out.println("Impossible de diminuer le stock logique !");
                }
            }


        }
        panier.setEtatCommande("en cours");
        commandeRepoitory.save(panier);

        return "Commande validée";
    }
}
