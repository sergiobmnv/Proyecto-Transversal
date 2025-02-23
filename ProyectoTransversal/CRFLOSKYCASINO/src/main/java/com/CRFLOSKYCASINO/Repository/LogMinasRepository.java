package com.CRFLOSKYCASINO.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRFLOSKYCASINO.Entity.LogMinasEntity;

@Repository
public interface LogMinasRepository extends JpaRepository <LogMinasEntity, Long> {
    
    Optional <LogMinasEntity> findByid(Long id);
}
