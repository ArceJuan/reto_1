package com.reto.shoppingSimulator.models.service;

import com.reto.shoppingSimulator.models.entity.DataResponse;
import com.reto.shoppingSimulator.models.repository.CuotaRepository;
import com.reto.shoppingSimulator.models.repository.DiaPagoRepository;
import com.reto.shoppingSimulator.models.repository.TarjetaRepository;
import com.reto.shoppingSimulator.models.repository.TeaRepository;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements IDataService {

    @Autowired
    private TarjetaRepository tarjetaRepository;

    @Autowired
    private DiaPagoRepository diasPagoRepository;

    @Autowired
    private TeaRepository teaRepository;

    @Autowired
    private CuotaRepository cuotaRepository;

    @Override
    public Single<DataResponse> findAllData() {
        DataResponse DataR = new DataResponse(tarjetaRepository.findAll(),diasPagoRepository.findAll(),teaRepository.findAll(),cuotaRepository.findAll());
        return Single.just(DataR);
    }


}
