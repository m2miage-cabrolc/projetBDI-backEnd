package miagiles.gromed.controller;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Commande;
import miagiles.gromed.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/api/commandes")
public class CommandeController {

    // @Autowired
    // private CommandeService commandeService;

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

}
