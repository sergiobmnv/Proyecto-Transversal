package com.CRFLOSKYCASINO.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRFLOSKYCASINO.Entity.JuegoEntity;

@Repository
public interface JuegoRepository extends JpaRepository<JuegoEntity, Long>{
    Optional<JuegoEntity> findById(Long id);
}
