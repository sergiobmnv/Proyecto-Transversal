package com.CRFLOSKYCASINO.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CRFLOSKYCASINO.Model.UsuarioDTO;
import com.CRFLOSKYCASINO.Service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/index")
    public String mostrarLobby(){
        
        return "index";
    }
    
    @PostMapping("/registro")
    public String registrarUsuario(@RequestBody UsuarioDTO usuario){
        usuarioService.registrarUsuario(usuario);
        return "USUARIO REGISTRADO CORRECTAMENTE";
    }
}
