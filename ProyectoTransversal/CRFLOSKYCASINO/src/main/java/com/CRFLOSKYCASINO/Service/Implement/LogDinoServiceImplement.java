package com.CRFLOSKYCASINO.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRFLOSKYCASINO.Repository.LogDinoRepository;
import com.CRFLOSKYCASINO.Service.LogDinoService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LogDinoServiceImplement implements LogDinoService{
    

    @Autowired
    LogDinoRepository logDinoRepository;
}
