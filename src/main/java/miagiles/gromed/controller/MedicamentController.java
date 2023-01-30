package miagiles.gromed.controller;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Medicament;
import miagiles.gromed.repository.MedicamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/meds")
public class MedicamentController {
    @Autowired
    private MedicamentRepository repository;

    @GetMapping(value="/")
    public ResponseEntity<Iterable<Medicament>> getAll(HttpServletResponse httpServletResponse){
        return ResponseEntity.ok(repository.findAll());
    }

}
