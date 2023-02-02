package miagiles.gromed.controller;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Commande;
import miagiles.gromed.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/api/commandes")
@CrossOrigin
public class CommandeController {

    @Autowired
    private CommandeService commandeService;

    @GetMapping(value="/allCommande")
    public ResponseEntity<Iterable<Commande>> read(HttpServletResponse response) {
        return ResponseEntity.ok( commandeService.findAll() );
    }
    @PostMapping("/createCommande")
    public void createPanier(String userMail){
        commandeService.createPanier(userMail);
    }
    @GetMapping("/getPanier")
    public ResponseEntity<Commande> getPanier(String userMail){
        Commande panier = commandeService.getPanier(userMail);
        if(panier==null){
            return (ResponseEntity<Commande>) ResponseEntity.internalServerError();
        }
        return  ResponseEntity.ok(panier);
    }


    @GetMapping("/validerPanier")
    public ResponseEntity<List<Integer>> validerPanier(String userMail, boolean isForced){
        List<Integer> res = commandeService.validerCommande(userMail, isForced);
        return ResponseEntity.ok(res);
    }
}
