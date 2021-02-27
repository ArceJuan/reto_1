package com.reto.shoppingSimulator.models.service;

import com.reto.shoppingSimulator.models.entity.DataResponse;
import io.reactivex.Single;

public interface IDataService {

    public Single<DataResponse> findAllData();
}
