package miagiles.gromed.controller;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Composition;
import miagiles.gromed.repository.CompositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/compositions")
@CrossOrigin
public class CompositionController {
    @Autowired
    private CompositionRepository repository;


    @GetMapping(value="/")
    public ResponseEntity<Iterable<Composition>> read(HttpServletResponse response) {
        return ResponseEntity.ok( repository.findAll() );
    }
}
