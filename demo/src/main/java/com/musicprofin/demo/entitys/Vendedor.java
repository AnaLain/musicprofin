package com.musicprofin.demo.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vendedor")
public class Vendedor {

    @Id
    @Column(name="id_ven")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ven;

    @Column(name="rut_ven", nullable=false, length=30)
    private String rut_ven;
    @Column(name="nom_ven", nullable=false, length=30)
    private String nom_ven; 
    @Column(name="ape_ven", nullable=false, length=30)
    private String ape_ven;
    @Column(name="edad_ven", nullable=false, length=30)
    private String edad_ven;
    @Column(name="sexo_ven", nullable=false, length=30)
    private String sexo_ven;
    @Column(name="correo_ven", nullable=false, length=30)
    private String correo_ven;
    @Column(name="tel_ven", nullable=false, length=30)
    private int tel_ven;


    public Long getId_ven() {
        return id_ven;
    }
    public void setId_ven(Long id_ven) {
        this.id_ven = id_ven;
    }
    public String getRut_ven() {
        return rut_ven;
    }
    public void setRut_ven(String rut_ven) {
        this.rut_ven = rut_ven;
    }
    public String getNom_ven() {
        return nom_ven;
    }
    public void setNom_ven(String nom_ven) {
        this.nom_ven = nom_ven;
    }
    public String getApe_ven() {
        return ape_ven;
    }
    public void setApe_ven(String ape_ven) {
        this.ape_ven = ape_ven;
    }
    public String getEdad_ven() {
        return edad_ven;
    }
    public void setEdad_ven(String edad_ven) {
        this.edad_ven = edad_ven;
    }
    public String getSexo_ven() {
        return sexo_ven;
    }
    public void setSexo_ven(String sexo_ven) {
        this.sexo_ven = sexo_ven;
    }
    public String getCorreo_ven() {
        return correo_ven;
    }
    public void setCorreo_ven(String correo_ven) {
        this.correo_ven = correo_ven;
    }
    public int getTel_ven() {
        return tel_ven;
    }
    public void setTel_ven(int tel_ven) {
        this.tel_ven = tel_ven;
    }

    
}
