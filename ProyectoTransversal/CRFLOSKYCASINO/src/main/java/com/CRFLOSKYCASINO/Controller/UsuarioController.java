package com.CRFLOSKYCASINO.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    
    @GetMapping("/index")
    public String mostrarLobby(){
        
        return "index";
    }
    
}
