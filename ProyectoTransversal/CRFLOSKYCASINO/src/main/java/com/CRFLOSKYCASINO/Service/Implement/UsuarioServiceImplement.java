package com.CRFLOSKYCASINO.Service.Implement;

import java.util.Optional;

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
        usuarioE.setUsername(usuario.getUsername());
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

    @Override
    public UsuarioEntity encontrarPorUsuario(String username){
        Optional<UsuarioEntity> usuario = usuarioRepository.findByUsername(username);
            return usuario.orElse(null);
    }

    @Override
public UsuarioDTO validarUsuario(UsuarioEntity usuario, String pwd) {
    if (usuario == null || !usuario.getPwd().equals(pwd)) {
        return null; // Si no existe o la contraseña no coincide, devolvemos null
    }

    UsuarioDTO usuarioDTO = new UsuarioDTO();
    usuarioDTO.setUsername(usuario.getUsername());
    usuarioDTO.setPwd(usuario.getPwd());
    usuarioDTO.setEmail(usuario.getEmail());
    usuarioDTO.setNombre(usuario.getNombre());
    usuarioDTO.setApellido(usuario.getApellido());
    usuarioDTO.setDni(usuario.getDni());
    usuarioDTO.setFechaNacimiento(usuario.getFechaNacimiento());
    usuarioDTO.setMonedero(usuario.getMonedero());
    usuarioDTO.setSaldo(usuario.getSaldo());
    usuarioDTO.setVip(usuario.isVip());

    return usuarioDTO;
}

    
}
