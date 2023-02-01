package miagiles.gromed.controller;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Commande;
import miagiles.gromed.entity.Presentation;
import miagiles.gromed.entity.PresentationDeCommande;
import miagiles.gromed.entity.Utilisateur;
import miagiles.gromed.repository.PresentationCommandeRepository;
import miagiles.gromed.repository.PresentationRepository;
import miagiles.gromed.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/commande_pres")
public class PresentationCommandeController {

    @Autowired
    private PresentationRepository presentationRepository;

    @Autowired
    private PresentationCommandeRepository repository;

    @Autowired
    private UtilisateurRepository utilisateurRepository;


    @GetMapping(value="/")
    public ResponseEntity<Iterable<PresentationDeCommande>> getCommandePres(HttpServletResponse httpServletResponse){
        return ResponseEntity.ok(repository.findAll());
    }



    @PostMapping("/addToCart")
    public ResponseEntity<PresentationDeCommande> updateCommande(@RequestBody PresentationDeCommande pres){
       return ResponseEntity.ok(repository.save(pres));
    }


}
