package miagiles.gromed.controller;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Medicament;
import miagiles.gromed.entity.Presentation;
import miagiles.gromed.repository.MedicamentRepository;
import miagiles.gromed.repository.PresentationRepository;
import miagiles.gromed.service.PresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RequestMapping(value="/api/presentations")
@RestController
public class PresentationController {
    @Autowired
    private PresentationRepository repository;

    @Autowired
    private PresentationService presentationService;



    @GetMapping(value="/")
    public ResponseEntity<Page<Presentation>> read(HttpServletResponse response, @RequestParam int pageSize, @RequestParam int page) {
        Pageable p = PageRequest.of(page,pageSize);
        return ResponseEntity.ok( repository.findAll(p) );
    }

    @GetMapping(value="/{codeCIP7}")
    public ResponseEntity<Presentation> getById(@PathVariable(value="codeCIP7") long codeCIP7, HttpServletResponse httpServletResponse){
        return ResponseEntity.ok(repository.findByCodeCIP7(codeCIP7));
    }

    @GetMapping(value="/meds/{denom}")
    public ResponseEntity<Iterable<Presentation>> getMeds(@PathVariable(value="denom") String denom, HttpServletResponse response){

        return ResponseEntity.ok(repository.findMedsByDenom(denom));

    }

    @GetMapping("/filtre")
    public List<Presentation> getPresentationsByFiltre(String denom , String formePharma){
        return presentationService.getPresentationsByFiltre(denom,formePharma);
    }

    /*@GetMapping(value="/presmeds")
    public ResponseEntity<HashMap<Long, Long>> getPresMeds(HttpServletResponse response){
        return ResponseEntity.ok(repository.findPresMeds());
    }*/

}
