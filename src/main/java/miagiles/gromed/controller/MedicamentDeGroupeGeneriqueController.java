package miagiles.gromed.controller;

import miagiles.gromed.repository.MedicamentDeGroupeGeneriqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicamentDeGroupeGeneriqueController {

    @Autowired
    private MedicamentDeGroupeGeneriqueRepository repository;
}
