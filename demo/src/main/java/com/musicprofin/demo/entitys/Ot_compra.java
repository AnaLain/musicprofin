package com.musicprofin.demo.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ot_compra")
public class Ot_compra {
    
    @Id
    @Column(name="id_ot")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ot;

    @Column(name="orden_ot", nullable=false, length=30)
    private String orden_ot; 
    @Column(name="fecha_ot", nullable=false, length=12)
    private int fecha_ot;

    public Long getId_ot() {
        return id_ot;
    }
    public void setId_ot(Long id_ot) {
        this.id_ot = id_ot;
    }
    public String getOrden_ot() {
        return orden_ot;
    }
    public void setOrden_ot(String orden_ot) {
        this.orden_ot = orden_ot;
    }
    public int getFecha_ot() {
        return fecha_ot;
    }
    public void setFecha_ot(int fecha_ot) {
        this.fecha_ot = fecha_ot;
    }

    
    
}
