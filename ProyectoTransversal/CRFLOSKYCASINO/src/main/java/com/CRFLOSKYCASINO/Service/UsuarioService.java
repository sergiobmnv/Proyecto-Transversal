package com.CRFLOSKYCASINO.Service;

import org.springframework.stereotype.Service;

import com.CRFLOSKYCASINO.Entity.UsuarioEntity;
import com.CRFLOSKYCASINO.Model.UsuarioDTO;

@Service
public interface UsuarioService {
    public UsuarioEntity registrarUsuario(UsuarioDTO usuario);
    UsuarioEntity encontrarPorUsuario(String username);
	UsuarioDTO validarUsuario(UsuarioEntity usuario,String pwd);
}
