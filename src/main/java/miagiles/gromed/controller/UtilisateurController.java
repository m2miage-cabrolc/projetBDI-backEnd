package miagiles.gromed.controller;


import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Commande;
import miagiles.gromed.entity.Utilisateur;
import miagiles.gromed.repository.UtilisateurRepository;
import miagiles.gromed.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public Utilisateur getUtilisteur(String adresseMail){
        return utilisateurService.getUtilisateur(adresseMail);
    }

    @GetMapping("/findIfExistUtilisateur")
    public boolean ifExistUsr(String adressMail , String mdp){
        return  utilisateurService.getIfExisteUtilisateur(adressMail,mdp);
    }

    /*@GetMapping(value=("/{id}/getPanier"))
    public ResponseEntity<Commande> getPanier(@PathVariable(value="id") long id, HttpServletResponse response){
        return utilisateurService.getPanier(id);
    }*/

}
