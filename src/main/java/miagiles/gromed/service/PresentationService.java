package miagiles.gromed.service;

import miagiles.gromed.entity.Presentation;
import miagiles.gromed.repository.PresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresentationService {
    @Autowired
    PresentationRepository presentationRepository;

    public Presentation getPresentationByCIP7(Long CIP7)
    {
        return presentationRepository.findByCodeCIP7(CIP7);
    }

}
