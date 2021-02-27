package com.reto.shoppingSimulator.models.service;

import com.reto.shoppingSimulator.models.entity.Tarjeta;
import com.reto.shoppingSimulator.models.repository.TarjetaRepository;

import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarjetaServiceImpl implements ITarjetaService{

    @Autowired
    private TarjetaRepository tarjetaRepository;

    @Override
    public Single<Tarjeta> findById (Long id){
        return Single.just(tarjetaRepository.findById(id).orElse(null));
    }
}
