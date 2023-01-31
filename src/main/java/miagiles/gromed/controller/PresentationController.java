package miagiles.gromed.controller;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Medicament;
import miagiles.gromed.entity.Presentation;
import miagiles.gromed.repository.MedicamentRepository;
import miagiles.gromed.repository.PresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(value="/api/presentations")
@RestController
public class PresentationController {
    @Autowired
    private PresentationRepository repository;



    @GetMapping(value="/")
    public ResponseEntity<Iterable<Presentation>> read(HttpServletResponse response) {
        return ResponseEntity.ok( repository.findAll() );
    }

    @GetMapping(value="/meds/{denom}")
    public ResponseEntity<Iterable<Medicament>> getMeds(@PathVariable(value="denom") String denom, HttpServletResponse response){

        return ResponseEntity.ok(repository.findMedsByDenom(denom));

    }
}
