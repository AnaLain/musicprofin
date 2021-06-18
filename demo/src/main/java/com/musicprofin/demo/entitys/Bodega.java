package com.musicprofin.demo.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bodega")
public class Bodega {

    @Id
    @Column(name="id_bod")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_bod;

    @Column(name="rut_bod", nullable=false, length=30)
    private String rut_bod;
    @Column(name="nom_bod", nullable=false, length=30)
    private String nom_bod; 
    @Column(name="ape_bod", nullable=false, length=30)
    private String ape_bod;
    @Column(name="edad_bod", nullable=false, length=30)
    private String edad_bod;
    @Column(name="categoria_bod", nullable=false, length=30)
    private String categoria_bod;
    @Column(name="correo_bod", nullable=false, length=30)
    private String correo_bod;
    @Column(name="tel_tel", nullable=false, length=30)
    private int tel_tel;
    
    public Long getId_bod() {
        return id_bod;
    }
    public void setId_bod(Long id_bod) {
        this.id_bod = id_bod;
    }
    public String getRut_bod() {
        return rut_bod;
    }
    public void setRut_bod(String rut_bod) {
        this.rut_bod = rut_bod;
    }
    public String getNom_bod() {
        return nom_bod;
    }
    public void setNom_bod(String nom_bod) {
        this.nom_bod = nom_bod;
    }
    public String getApe_bod() {
        return ape_bod;
    }
    public void setApe_bod(String ape_bod) {
        this.ape_bod = ape_bod;
    }
    public String getEdad_bod() {
        return edad_bod;
    }
    public void setEdad_bod(String edad_bod) {
        this.edad_bod = edad_bod;
    }
    public String getCategoria_bod() {
        return categoria_bod;
    }
    public void setCategoria_bod(String categoria_bod) {
        this.categoria_bod = categoria_bod;
    }
    public String getCorreo_bod() {
        return correo_bod;
    }
    public void setCorreo_bod(String correo_bod) {
        this.correo_bod = correo_bod;
    }
    public int getTel_tel() {
        return tel_tel;
    }
    public void setTel_tel(int tel_tel) {
        this.tel_tel = tel_tel;
    }

    
}
