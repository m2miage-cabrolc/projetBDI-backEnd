package miagiles.gromed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class HelloController {

    @GetMapping("/coucou")
    public String coucou(){
        return "coucou";
    }
}
