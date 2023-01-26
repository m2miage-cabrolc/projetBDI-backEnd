package miagiles.gromed.controller;


import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.model.Commande;
import miagiles.gromed.model.Utilisateur;
import miagiles.gromed.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/utilisateurs")
@RestController
public class UtilisateurController {

    @Autowired
    private UtilisateurRepository repository;

    /*@PostMapping(value="/{utilisateur°/createPanier")
    public ResponseEntity<Utilisateur> create(@PathVariable(value="utilisateur") long id, HttpServletResponse response){
    }*/
}
