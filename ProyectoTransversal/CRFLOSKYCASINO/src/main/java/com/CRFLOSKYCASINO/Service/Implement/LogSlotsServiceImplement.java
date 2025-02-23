package com.CRFLOSKYCASINO.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRFLOSKYCASINO.Repository.LogSlotsRepository;
import com.CRFLOSKYCASINO.Service.LogSlotsService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LogSlotsServiceImplement implements LogSlotsService{
    

    @Autowired
    LogSlotsRepository logSlotsRepository;
}
