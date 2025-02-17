package com.CRFLOSKYCASINO.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRFLOSKYCASINO.Entity.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,String> {
    Optional<UsuarioEntity> findById(String id);
}
