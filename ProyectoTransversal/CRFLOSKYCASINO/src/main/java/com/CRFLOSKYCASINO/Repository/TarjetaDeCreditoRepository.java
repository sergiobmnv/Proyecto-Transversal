package com.CRFLOSKYCASINO.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRFLOSKYCASINO.Entity.TarjetaCreditoEntity;

@Repository
public interface TarjetaDeCreditoRepository  extends JpaRepository <TarjetaCreditoEntity, Long>{

    Optional <TarjetaCreditoEntity> findByid(Long id);
    
}
