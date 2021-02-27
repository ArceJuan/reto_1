package com.reto.shoppingSimulator.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "tea")
public class Tea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String porcentaje;

    public Tea() {
    }

    public Tea(Long id, String porcentaje) {
        this.id = id;
        this.porcentaje = porcentaje;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
}
