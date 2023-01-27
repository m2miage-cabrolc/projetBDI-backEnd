package miagiles.gromed.controller;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Commande;
import miagiles.gromed.entity.Presentation;
import miagiles.gromed.entity.PresentationDeCommande;
import miagiles.gromed.entity.Utilisateur;
import miagiles.gromed.entity.key.PresentationCommande;
import miagiles.gromed.repository.CommandeRepository;
import miagiles.gromed.repository.PresentationCommandeRepository;
import miagiles.gromed.repository.PresentationRepository;
import miagiles.gromed.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value="/api/commandes")
public class CommandeController {

    @Autowired
    CommandeRepository repository;

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Autowired
    PresentationCommandeRepository presentationCommandeRepository;

    @Autowired
    PresentationRepository presentationRepository;

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
    public ResponseEntity<Commande> createCommande(@PathVariable(value="user") long id,HttpServletResponse response){
        Commande commande = new Commande();
        commande.setEtatCommande("Panier");
        Utilisateur user = null;
        if(utilisateurRepository.findById(id).isPresent()) {
            user = utilisateurRepository.findById(id).get();
            user.addCommande(commande);
            repository.save(commande);
        }

        Commande res = repository.save(commande);

        utilisateurRepository.save(user);

        return ResponseEntity.ok(res);
    }

    @PostMapping("{user}/addToCart")
    public ResponseEntity<PresentationDeCommande> addToCart(@PathVariable(value="user") long id,@RequestBody PresentationDeCommande pc,HttpServletResponse response){

        return ResponseEntity.ok(presentationCommandeRepository.save(pc));

    }


}
