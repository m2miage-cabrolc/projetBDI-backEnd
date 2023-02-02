package miagiles.gromed.service;

import miagiles.gromed.entity.Medicament;
import miagiles.gromed.repository.MedicamentRepository;
import miagiles.gromed.utils.RechercheSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentService {
    @Autowired
    MedicamentRepository medicamentRepository;

    public List<Medicament> getMedicaments(String prefix){
        return medicamentRepository.getMedicamentByDenomination(prefix);
    }

    public Iterable<Medicament> getAllMedicaments() {
        return medicamentRepository.findAll();
    }

    public List<Medicament> findMedicamentByFilter(String denomination , Long codeCIS){
        return medicamentRepository.findAll(new RechercheSpecification(denomination,codeCIS));
    }
}
