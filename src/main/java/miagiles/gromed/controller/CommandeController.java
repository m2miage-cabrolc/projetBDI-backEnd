package miagiles.gromed.controller;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Commande;
import miagiles.gromed.entity.Utilisateur;
import miagiles.gromed.repository.CommandeRepository;
import miagiles.gromed.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/api/commandes")
public class CommandeController {

    @Autowired
    CommandeRepository repository;

    @Autowired
    UtilisateurRepository utilisateurRepository;

    // @Autowired
    // private CommandeService;

    // @GetMapping(value="/allCommande")
    // public ResponseEntity<Iterable<Commande>> read(HttpServletResponse response) {
    //     return ResponseEntity.ok( commandeService.findAll() );
    // }
    // @PostMapping("/createCommande")
    // public void createCommande(@RequestBody Commande commande , String userMail){
    //     commandeService.createCommande(commande, userMail);
    // }
    // @GetMapping("/getCommande")
    // public Commande getPanier(String userMail){
    //     return  commandeService.getPanier(userMail);
    // }

    @PostMapping("/{user}/create_panier")
    public ResponseEntity<Utilisateur> createCommande(@PathVariable(value="user") long id, HttpServletResponse response){
        Commande commande = new Commande();
        commande.setEtatCommande("Panier");
        Utilisateur user = null;
        if(utilisateurRepository.findById(id).isPresent()) {
            user = utilisateurRepository.findById(id).get();
            user.addCommande(commande);
            repository.save(commande);
        }

        return ResponseEntity.ok(utilisateurRepository.save(user));
    }

}
