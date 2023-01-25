package miagiles.gromed.controller;

import miagiles.gromed.repository.CommandeRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandeController {

    @Autowired
    private CommandeRepoitory repoitory;
}
