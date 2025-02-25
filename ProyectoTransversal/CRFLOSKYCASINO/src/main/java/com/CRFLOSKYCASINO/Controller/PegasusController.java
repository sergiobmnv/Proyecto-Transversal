package com.CRFLOSKYCASINO.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class PegasusController {
    
    @GetMapping("/juegoPegasus/pegasus")
    public String mostrarJuegoPegasus() {

        return "juegoPegasus/pegasus";
    }
    

}
