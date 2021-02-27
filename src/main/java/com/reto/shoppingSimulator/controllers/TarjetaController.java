package com.reto.shoppingSimulator.controllers;

import com.reto.shoppingSimulator.models.service.ITarjetaService;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarjetaController {

    @Autowired
    private ITarjetaService tarjetaService;

    @GetMapping("/tarjeta")
    public Single<?> tarjeta (@RequestParam Long id){
        return tarjetaService.findById(id);
    }
}
