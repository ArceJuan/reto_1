package com.reto.shoppingSimulator.models.entity;

import java.util.List;

public class DataResponse {

    private List<Tarjeta> tarjetas;
    private List<DiaPago> diasPago;
    private List<Tea> teas;
    private List<Cuota> cuotas;

    public DataResponse() {
    }

    public DataResponse(List<Tarjeta> tarjetas, List<DiaPago> diasPago, List<Tea> teas, List<Cuota> cuotas) {
        this.tarjetas = tarjetas;
        this.diasPago = diasPago;
        this.teas = teas;
        this.cuotas = cuotas;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public List<DiaPago> getDiasPago() {
        return diasPago;
    }

    public void setDiasPago(List<DiaPago> diasPago) {
        this.diasPago = diasPago;
    }

    public List<Tea> getTeas() {
        return teas;
    }

    public void setTeas(List<Tea> teas) {
        this.teas = teas;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
}
