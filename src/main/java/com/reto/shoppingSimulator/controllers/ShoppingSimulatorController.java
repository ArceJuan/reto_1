package com.reto.shoppingSimulator.controllers;

import com.reto.shoppingSimulator.models.entity.Formulario;
import com.reto.shoppingSimulator.models.entity.Response;
import com.reto.shoppingSimulator.models.service.IDataService;
import com.reto.shoppingSimulator.models.service.ISimuladorService;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingSimulatorController {

    @Autowired
    private ISimuladorService simuladorService;

    @PostMapping(value = "/shopping/simulator")
    public Single<?> tipoCambio(@RequestBody Formulario formulario) {
        return Single.just(simuladorService.calcular(formulario));
    }
}
