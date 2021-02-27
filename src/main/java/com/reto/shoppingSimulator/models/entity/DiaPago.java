package com.reto.shoppingSimulator.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "DIAPAGO")
public class DiaPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dia;

    public DiaPago() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String nombre) {
        this.dia = nombre;
    }
}
