package com.CRFLOSKYCASINO.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRFLOSKYCASINO.Entity.ConversionEntity;

@Repository
public interface ConversionRepository extends JpaRepository<ConversionEntity, Long> {
    Optional<ConversionEntity> findById(Long id);
    
}
