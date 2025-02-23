package com.CRFLOSKYCASINO.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRFLOSKYCASINO.Repository.LogMinasRepository;
import com.CRFLOSKYCASINO.Service.LogMinasService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LogMinasServiceImplement implements LogMinasService{
    
    @Autowired
    LogMinasRepository logMinasRepository;
}
