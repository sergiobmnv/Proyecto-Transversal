package com.CRFLOSKYCASINO.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRFLOSKYCASINO.Entity.ConversionEntity;
import com.CRFLOSKYCASINO.Model.ConversionDTO;
import com.CRFLOSKYCASINO.Repository.ConversionRepository;
import com.CRFLOSKYCASINO.Service.ConversionService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ConversionServiceImplement implements ConversionService {

     @Autowired
    private ConversionRepository conversionRepository;

    @Override
    public ConversionEntity registrarConversion(ConversionDTO conversionDTO) {
        
        // Crear una nueva instancia de ConversionEntity y mapear los datos desde DTO
        ConversionEntity conversionEntity = new ConversionEntity();
        //conversionEntity.setMonto(conversionDTO.getMonto());
        //conversionEntity.setMonedaOrigen(conversionDTO.getMonedaOrigen());
        //conversionEntity.setMonedaDestino(conversionDTO.getMonedaDestino());
        //conversionEntity.setFechaConversion(conversionDTO.getFechaConversion());

        // Guardar la conversión en la base de datos
        return conversionRepository.save(conversionEntity);
    }

}
