package miagiles.gromed.controller;

import miagiles.gromed.repository.PresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresentationController {
    @Autowired
    private PresentationRepository repository;
}
