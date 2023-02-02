package miagiles.gromed.service;

import miagiles.gromed.entity.Medicament;
import miagiles.gromed.entity.Presentation;
import miagiles.gromed.repository.PresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresentationService {
    @Autowired
    PresentationRepository presentationRepository;
    @Autowired MedicamentService medicamentService;

    public Presentation getPresentationByCIP7(Long CIP7)
    {
        return presentationRepository.findByCodeCIP7(CIP7);
    }

    public List<Presentation> getPresentationsByFiltre(String denom, String formePharma) {
        List<Medicament> meds = medicamentService.g
    }
}
