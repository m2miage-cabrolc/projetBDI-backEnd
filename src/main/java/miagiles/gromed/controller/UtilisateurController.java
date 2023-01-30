package miagiles.gromed.controller;


import miagiles.gromed.entity.Utilisateur;
import miagiles.gromed.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/getUtilisateurs")
    public Iterable<Utilisateur> getUtilisateurs(){
        return utilisateurService.getUtilisateursListe();
    }

    @GetMapping("/getUtilisateur")
    public Utilisateur getUtilisateur(String adresseMail , String mdp){
        return utilisateurService.getUtilisateur(adresseMail);
    }

    @GetMapping("/findIfExistUtilisateur")
    public boolean ifExistUsr(String adressMail , String mdp){
        return  utilisateurService.getIfExisteUtilisateur(adressMail,mdp);
    }
}