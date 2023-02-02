package miagiles.gromed.service;

import miagiles.gromed.entity.Medicament;
import miagiles.gromed.entity.Presentation;
import miagiles.gromed.repository.MedicamentRepository;
import miagiles.gromed.repository.PresentationRepository;
import miagiles.gromed.utils.RechercheSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PresentationService {
    @Autowired
    PresentationRepository presentationRepository;
    @Autowired
    MedicamentRepository medicamentRepository;

    public Presentation getPresentationByCIP7(Long cip7)
    {
        return presentationRepository.findByCodeCIP7(cip7);
    }


    public Iterable<Presentation> getPresentationsByFiltres(String denom, String formePharma) {
        List<Medicament> meds = medicamentRepository.findAll(new RechercheSpecification(denom,formePharma));
        List<Presentation> res = new ArrayList<>();
        for(Medicament med : meds){
            res.addAll(presentationRepository.findByMedicaments(med));
        }
        return res ;
    }
}
