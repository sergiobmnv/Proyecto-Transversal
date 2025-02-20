package com.CRFLOSKYCASINO.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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
			@PathVariable("pwd") String pwd, HttpSession sesion) {
		UsuarioEntity usuario = usuarioService.encontrarPorUsuario(username);
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		String respuesta;
		if(usuario==null) {
			respuesta = "404";
		}else {
			 usuarioDTO = usuarioService.validarUsuario(usuario, pwd);
			 if(usuarioDTO.getNombre()==null) {
				 respuesta = "Contraseña incorrecta";
			 }else {
                //Si el Login ha sido correcto, guardamos al usuario en la sesión.
                sesion.setAttribute("usuario", usuario);
				 respuesta = "OK";
			 }
		}
		System.out.println("Voy a mandar" +respuesta+ "porque el entity está vacío");
		return respuesta;
	}

}
