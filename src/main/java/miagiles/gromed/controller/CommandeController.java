package miagiles.gromed.controller;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.model.Commande;
import miagiles.gromed.repository.CommandeRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/api/commandes")
public class CommandeController {

    @Autowired
    private CommandeRepoitory repository;

    @GetMapping(value="/")
    public ResponseEntity<Iterable<Commande>> read(HttpServletResponse response) {
        return ResponseEntity.ok( repository.findAll() );
    }
}
