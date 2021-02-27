package com.reto.shoppingSimulator.models.service;

import com.reto.shoppingSimulator.models.entity.Tarjeta;
import io.reactivex.Single;

public interface ITarjetaService {
    public Single<Tarjeta> findById (Long id);
}
