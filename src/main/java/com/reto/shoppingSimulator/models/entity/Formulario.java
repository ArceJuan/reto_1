package com.reto.shoppingSimulator.models.entity;

public class Formulario {

    private String dni;
    private String tarjeta;
    private String moneda;
    private double monto;
    private int cuota;
    private String tea;
    private String diaPago;

    public Formulario() {
    }

    public Formulario(String dni, String tarjeta, String moneda, double monto, int cuota, String tea, String diaPago) {
        this.dni = dni;
        this.tarjeta = tarjeta;
        this.moneda = moneda;
        this.monto = monto;
        this.cuota = cuota;
        this.tea = tea;
        this.diaPago = diaPago;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public String getTea() {
        return tea;
    }

    public void setTea(String tea) {
        this.tea = tea;
    }

    public String getDiaPago() {
        return diaPago;
    }

    public void setDiaPago(String diaPago) {
        this.diaPago = diaPago;
    }
}
