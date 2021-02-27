package com.reto.shoppingSimulator.models.service;

import com.reto.shoppingSimulator.models.entity.Formulario;
import com.reto.shoppingSimulator.models.entity.Response;
import io.reactivex.Single;

public interface ISimuladorService {

    public Single<Response> calcular(Formulario formulario);


}
