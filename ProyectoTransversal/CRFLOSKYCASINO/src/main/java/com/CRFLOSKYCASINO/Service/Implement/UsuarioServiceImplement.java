package com.CRFLOSKYCASINO.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRFLOSKYCASINO.Entity.UsuarioEntity;
import com.CRFLOSKYCASINO.Model.UsuarioDTO;
import com.CRFLOSKYCASINO.Repository.UsuarioRepository;
import com.CRFLOSKYCASINO.Service.UsuarioService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioServiceImplement implements UsuarioService {
   
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UsuarioEntity registrarUsuario(UsuarioDTO usuario){
        UsuarioEntity usuarioE = new UsuarioEntity();
        usuarioE.setUsername(usuario.getNombre());
        usuarioE.setPwd(usuario.getPwd());
        usuarioE.setEmail(usuario.getEmail());
        usuarioE.setNombre(usuario.getNombre());
        usuarioE.setApellido(usuario.getApellido());
        usuarioE.setDni(usuario.getDni());
        usuarioE.setFecha_nacimiento(usuario.getFechaNacimiento());
        usuarioE.setMonedero(0);
        usuarioE.setSaldo(0);
        usuarioE.setVip(false);
        return usuarioRepository.save(usuarioE);
    }
    
}
