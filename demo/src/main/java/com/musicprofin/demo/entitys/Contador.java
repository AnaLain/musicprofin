package com.musicprofin.demo.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contador")
public class Contador {

    @Id
    @Column(name="id_con")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_con;

    @Column(name="rut_con", nullable=false, length=30)
    private String rut_con;
    @Column(name="nom_con", nullable=false, length=30)
    private String nom_con; 
    @Column(name="ape_con", nullable=false, length=30)
    private String ape_con;
    @Column(name="edad_con", nullable=false, length=30)
    private String edad_con;
    @Column(name="correo_con", nullable=false, length=30)
    private String correo_con;
    @Column(name="tel_con", nullable=false, length=30)
    private int tel_con;

    
    public Long getId_con() {
        return id_con;
    }
    public void setId_con(Long id_con) {
        this.id_con = id_con;
    }
    public String getRut_con() {
        return rut_con;
    }
    public void setRut_con(String rut_con) {
        this.rut_con = rut_con;
    }
    public String getNom_con() {
        return nom_con;
    }
    public void setNom_con(String nom_con) {
        this.nom_con = nom_con;
    }
    public String getApe_con() {
        return ape_con;
    }
    public void setApe_con(String ape_con) {
        this.ape_con = ape_con;
    }
    public String getEdad_con() {
        return edad_con;
    }
    public void setEdad_con(String edad_con) {
        this.edad_con = edad_con;
    }
    public String getCorreo_con() {
        return correo_con;
    }
    public void setCorreo_con(String correo_con) {
        this.correo_con = correo_con;
    }
    public int getTel_con() {
        return tel_con;
    }
    public void setTel_con(int tel_con) {
        this.tel_con = tel_con;
    }

    
}
