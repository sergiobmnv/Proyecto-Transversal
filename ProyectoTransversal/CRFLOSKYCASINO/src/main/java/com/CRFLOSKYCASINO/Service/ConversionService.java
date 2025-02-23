package com.CRFLOSKYCASINO.Service;

import org.springframework.stereotype.Service;

import com.CRFLOSKYCASINO.Entity.ConversionEntity;
import com.CRFLOSKYCASINO.Model.ConversionDTO;

@Service
public interface ConversionService {
    public ConversionEntity registrarConversion (ConversionDTO conversion);
    
}