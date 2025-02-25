package com.CRFLOSKYCASINO.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRFLOSKYCASINO.Entity.UsuarioEntity;
import com.CRFLOSKYCASINO.Model.UsuarioDTO;
import com.CRFLOSKYCASINO.Service.UsuarioService;

import jakarta.servlet.http.HttpSession;

@RestController
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
        System.out.println("Usuario: " +usuario);
        usuarioService.registrarUsuario(usuario);
        return "USUARIO REGISTRADO CORRECTAMENTE";
    }

	@GetMapping("/{username}/{pwd}")
	public String iniciarSesion(@PathVariable("username") String username, 
								@PathVariable("pwd") String pwd) {
		UsuarioEntity usuario = usuarioService.encontrarPorUsuario(username);
	
		if (usuario == null) {
			System.out.println("Usuario no encontrado"); // DEBUG
			return "404";
		}
	
		UsuarioDTO usuarioDTO = usuarioService.validarUsuario(usuario, pwd);
		
		if (usuarioDTO.getPwd() == null) {
			System.out.println("Contraseña incorrecta"); // DEBUG
			return "PWDNF";
		} else {
			System.out.println("Usuario autenticado correctamente"); // DEBUG
			return "OK";
		}
	}
	

@GetMapping("/menuRegistrado/menuRegistrado")
    public String mostrarLobbyRegistrado(){
        
        return "menuRegistrado/menuRegistrado";
    }

}
