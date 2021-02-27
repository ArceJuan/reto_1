package com.reto.shoppingSimulator.controllers;

import com.reto.shoppingSimulator.models.service.IDataService;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private IDataService dataService;

    @GetMapping("/data")
    public Single<?> data(){
        return dataService.findAllData();
    }
}
