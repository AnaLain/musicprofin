package com.musicprofin.demo.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Precio")
public class Precio {

    @Id
    @Column(name="id_precio")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_precio;

    @Column(name="cod_precio", nullable=false, length=30)
    private String cod_precio;

    
    public Long getId_pecio() {
        return id_precio;
    }
    public void setId_pecio(Long id_precio) {
        this.id_precio = id_precio;
    }
    public String getCod_precio() {
        return cod_precio;
    }
    public void setCod_precio(String cod_precio) {
        this.cod_precio = cod_precio;
    } 
    
    
}
