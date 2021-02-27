package com.reto.shoppingSimulator.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "cuota")
public class Cuota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cuota;

    public Cuota() {
    }

    public Cuota(Long id, int cuota) {
        this.id = id;
        this.cuota = cuota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int couta) {
        this.cuota = couta;
    }
}
