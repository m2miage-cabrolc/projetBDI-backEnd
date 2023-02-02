package miagiles.gromed.controller;

import miagiles.gromed.repository.SubstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SubstanceController {
    @Autowired
    private SubstanceRepository repository;
}
