package com.CRFLOSKYCASINO.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRFLOSKYCASINO.Entity.LogDinoEntity;

@Repository
public interface LogDinoRepository extends JpaRepository <LogDinoEntity, Long>{
    
    Optional <LogDinoEntity> findByid(Long id);
}
