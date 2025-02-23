package com.CRFLOSKYCASINO.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRFLOSKYCASINO.Entity.LogSlotsEntity;

@Repository
public interface LogSlotsRepository extends JpaRepository <LogSlotsEntity, Long>{

    Optional <LogSlotsEntity> findByid(Long id);
    
}
