package miagiles.gromed.service;

import lombok.extern.java.Log;
import miagiles.gromed.entity.Commande;
import miagiles.gromed.entity.Utilisateur;
import miagiles.gromed.repository.CommandeRepository;
import miagiles.gromed.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
//s@Log
public class CommandeService {
    @Autowired
    CommandeRepository commandeRepository;
    @Autowired
    UtilisateurService utilisateurService;
    @Autowired
    UtilisateurRepository utilisateurRepository;

    public Iterable<Commande> findAll(){
        return commandeRepository.findAll();
    }

    // public void createCommande(Commande commande , String userMail) {
    //     try{
    //         Utilisateur user = utilisateurService.getUtilisateur(userMail);
    //         user.getCommandes().add(commande);
    //         utilisateurRepository.save(user);
    //         commandeRepoitory.save(commande);
    //     }catch(Exception e){
    //         log.info("Creation failed");
    //     }

    // }

    // public Commande getPanier(String userMail) {
    //     Utilisateur user = utilisateurService.getUtilisateur(userMail);
    //     Commande panier = new Commande() ;
    //     for(Commande cmd : user.getCommandes()){
    //         if(cmd.getEtatCommande()=="panier"){
    //             panier=cmd;
    //         }
    //     }
    //     return panier;
    // }
}
