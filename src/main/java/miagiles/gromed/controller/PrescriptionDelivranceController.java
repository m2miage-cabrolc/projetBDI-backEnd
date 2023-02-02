package miagiles.gromed.controller;


import miagiles.gromed.repository.PresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PrescriptionDelivranceController {
    @Autowired
    private PresentationRepository repository;
}
