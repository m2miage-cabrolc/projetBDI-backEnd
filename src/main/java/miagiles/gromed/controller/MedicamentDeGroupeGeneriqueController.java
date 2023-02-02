package miagiles.gromed.controller;

import miagiles.gromed.repository.MedicamentDeGroupeGeneriqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MedicamentDeGroupeGeneriqueController {

    @Autowired
    private MedicamentDeGroupeGeneriqueRepository repository;
}
