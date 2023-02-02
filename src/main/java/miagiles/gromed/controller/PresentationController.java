package miagiles.gromed.controller;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Presentation;
import miagiles.gromed.repository.PresentationRepository;
import miagiles.gromed.service.PresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value="/api/presentations")
@RestController
public class PresentationController {
    @Autowired
    private PresentationRepository repository;
    @Autowired
    private PresentationService presentationService ;

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

    @GetMapping("/findByFiltre")
    public Iterable<Presentation> getPresentationsByFiltre(String denom , String formePharma ){
        return presentationService.getPresentationsByFiltres(denom,formePharma);
    }
}
