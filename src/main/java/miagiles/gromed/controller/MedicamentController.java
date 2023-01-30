package miagiles.gromed.controller;

import miagiles.gromed.repository.MedicamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicamentController {
    @Autowired
    private MedicamentRepository repository;

}
