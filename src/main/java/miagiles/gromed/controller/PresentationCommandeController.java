package miagiles.gromed.controller;

import miagiles.gromed.repository.PresentationCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresentationCommandeController {

    @Autowired
    private PresentationCommandeRepository repository;
}
