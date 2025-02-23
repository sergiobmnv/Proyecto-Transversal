package com.CRFLOSKYCASINO.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRFLOSKYCASINO.Repository.TarjetaDeCreditoRepository;
import com.CRFLOSKYCASINO.Service.TarjetaDeCreditoService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TarjetaDeCreditoServiceImplement implements TarjetaDeCreditoService{
    

    @Autowired
    TarjetaDeCreditoRepository tarjetaDeCreditoRepository;
}
