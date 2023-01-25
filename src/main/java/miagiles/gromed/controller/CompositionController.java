package miagiles.gromed.controller;

import miagiles.gromed.repository.CompositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompositionController {
    @Autowired
    private CompositionRepository repository;
}
