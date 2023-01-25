package miagiles.gromed.controller;

import miagiles.gromed.repository.SubstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubstanceController {
    @Autowired
    private SubstanceRepository repository;
}
