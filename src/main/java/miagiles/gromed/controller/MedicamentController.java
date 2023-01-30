package miagiles.gromed.controller;

import miagiles.gromed.entity.Medicament;
import miagiles.gromed.repository.MedicamentRepository;
import miagiles.gromed.service.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicamentController {
    @Autowired
    private MedicamentService medicamentService ;

    @GetMapping("/filtre/denomination")
    public List<Medicament> getMedicamentByDenomination(String prefix){
        return medicamentService.getMedicaments(prefix);
    }

    @GetMapping("/medicaments")
    public Iterable<Medicament> getMedicaments(){
        return medicamentService.getAllMedicaments();
    }
}
