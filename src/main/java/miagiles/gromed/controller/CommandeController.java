package miagiles.gromed.controller;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Commande;
import miagiles.gromed.entity.Presentation;
import miagiles.gromed.entity.PresentationDeCommande;
import miagiles.gromed.repository.PresentationRepository;
import miagiles.gromed.service.CommandeService;
import miagiles.gromed.service.PresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/api/commandes")
public class CommandeController {

    @Autowired
    private CommandeService commandeService;

    @GetMapping(value="/allCommande")
    public ResponseEntity<Iterable<Commande>> read(HttpServletResponse response) {
        return ResponseEntity.ok( commandeService.findAll() );
    }
    @PostMapping("/createCommande")
    public void createCommande(@RequestBody Commande commande ){
        commandeService.createCommande(commande);
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
    public ResponseEntity<String> validerPanier(String userMail){
        String res = commandeService.validerCommande(userMail);
        if(!res.equals("Commande validée")){
            return (ResponseEntity<String>) ResponseEntity.internalServerError();
        }

        return ResponseEntity.ok(res);
    }
}
