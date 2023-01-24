package miagiles.gromed.controller;

import miagiles.gromed.repository.VoieAdministrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoieAdministrationController {
    @Autowired
    private VoieAdministrationRepository repository;
}
