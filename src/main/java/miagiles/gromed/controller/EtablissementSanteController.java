package miagiles.gromed.controller;


import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.EtablissementSante;
import miagiles.gromed.repository.EtablissementSanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/etablissements")
public class EtablissementSanteController {

    @Autowired
    private EtablissementSanteRepository repository;


    @GetMapping(value="/")
    public ResponseEntity<Iterable<EtablissementSante>> read(HttpServletResponse response) {
        return ResponseEntity.ok( repository.findAll() );
    }
}
