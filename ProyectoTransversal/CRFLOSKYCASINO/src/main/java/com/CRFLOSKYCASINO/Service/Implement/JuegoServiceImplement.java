package com.CRFLOSKYCASINO.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRFLOSKYCASINO.Repository.JuegoRepository;
import com.CRFLOSKYCASINO.Service.JuegoService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class JuegoServiceImplement implements JuegoService{
    
    @Autowired
    JuegoRepository juegoRepository;

}
