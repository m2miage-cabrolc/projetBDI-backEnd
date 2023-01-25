package miagiles.gromed.controller;

import miagiles.gromed.repository.GroupeGeneriqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupeGeneriqueController {
    @Autowired
    private GroupeGeneriqueRepository repository;
}
