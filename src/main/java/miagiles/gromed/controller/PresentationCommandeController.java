package miagiles.gromed.controller;

import miagiles.gromed.entity.Commande;
import miagiles.gromed.entity.Presentation;
import miagiles.gromed.entity.PresentationDeCommande;
import miagiles.gromed.entity.Utilisateur;
import miagiles.gromed.repository.PresentationCommandeRepository;
import miagiles.gromed.repository.PresentationRepository;
import miagiles.gromed.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/add_pres")
public class PresentationCommandeController {

    @Autowired
    private PresentationRepository presentationRepository;

    @Autowired
    private PresentationCommandeRepository repository;

    @Autowired
    private UtilisateurRepository utilisateurRepository;



    @PutMapping("/{utilisateur}/")
    public ResponseEntity<PresentationDeCommande> updateCommande(@PathVariable(value="utilisateur") long id, @RequestBody Presentation pres){
        Utilisateur user = utilisateurRepository.findById(id).get();
        return null;
    }


}
