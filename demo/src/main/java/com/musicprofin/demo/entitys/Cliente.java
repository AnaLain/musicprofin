package com.musicprofin.demo.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente {

    @Id
    @Column(name="id_cli")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_cli;

    @Column(name="rut_cli", nullable=false, length=30)
    private String rut_cli;
    @Column(name="nom_cli", nullable=false, length=30)
    private String nom_cli; 
    @Column(name="ape_cli", nullable=false, length=30)
    private String ape_cli;
    @Column(name="edad_cli", nullable=false, length=30)
    private String edad_cli;
    @Column(name="correo_cli", nullable=false, length=30)
    private String correo_cli;
    @Column(name="tel_cli", nullable=false, length=30)
    private String tel_cli;
    
    public Long getId_cli() {
        return id_cli;
    }
    public void setId_cli(Long id_cli) {
        this.id_cli = id_cli;
    }
    public String getRut_cli() {
        return rut_cli;
    }
    public void setRut_cli(String rut_cli) {
        this.rut_cli = rut_cli;
    }
    public String getNom_cli() {
        return nom_cli;
    }
    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }
    public String getApe_cli() {
        return ape_cli;
    }
    public void setApe_cli(String ape_cli) {
        this.ape_cli = ape_cli;
    }
    public String getEdad_cli() {
        return edad_cli;
    }
    public void setEdad_cli(String edad_cli) {
        this.edad_cli = edad_cli;
    }
    public String getCorreo_cli() {
        return correo_cli;
    }
    public void setCorreo_cli(String correo_cli) {
        this.correo_cli = correo_cli;
    }
    public String getTel_cli() {
        return tel_cli;
    }
    public void setTel_cli(String tel_cli) {
        this.tel_cli = tel_cli;
    }
    

    
}
