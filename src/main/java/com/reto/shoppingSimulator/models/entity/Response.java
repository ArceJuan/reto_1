package com.reto.shoppingSimulator.models.entity;

public class Response {
    private String cuota;
    private String moneda;
    private String primeraCuota;
    private String estado;

    public Response() {
        this.cuota = "cuota";
        this.moneda = "moneda";
        this.primeraCuota = "primeraCuota";
        this.estado = "estado";
    }

    public Response(String cuota, String moneda, String primeraCuota, String estado) {
        this.cuota = cuota;
        this.moneda = moneda;
        this.primeraCuota = primeraCuota;
        this.estado = estado;
    }

    public String getCuota() {
        return cuota;
    }

    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getPrimeraCuota() {
        return primeraCuota;
    }

    public void setPrimeraCuota(String primeraCuota) {
        this.primeraCuota = primeraCuota;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
