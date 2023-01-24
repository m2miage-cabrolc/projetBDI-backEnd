package miagiles.gromed.controller;


import miagiles.gromed.repository.EtablissementSanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtablissementSanteController {

    @Autowired
    private EtablissementSanteRepository repository;
}
