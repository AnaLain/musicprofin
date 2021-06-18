package com.musicprofin.demo.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class login {
    
    @Id
    @Column(name="id_login")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_login;

    @Column(name="rut_login", nullable=false, length=30)
    private String rut_login; 
    @Column(name="contrasena_login", nullable=false, length=30)
    private String contrasena_login;
    @Column(name="correo_login", nullable=false, length=30)
    private String correo_login;
    @Column(name="nom_login", nullable=false, length=30)
    private String nom_login;
    @Column(name="ape_login", nullable=false, length=30)
    private String ape_login;

    
    public Long getId_login() {
        return id_login;
    }
    public void setId_login(Long id_login) {
        this.id_login = id_login;
    }
    public String getRut_login() {
        return rut_login;
    }
    public void setRut_login(String rut_login) {
        this.rut_login = rut_login;
    }
    public String getContrasena_login() {
        return contrasena_login;
    }
    public void setContrasena_login(String contrasena_login) {
        this.contrasena_login = contrasena_login;
    }
    public String getCorreo_login() {
        return correo_login;
    }
    public void setCorreo_login(String correo_login) {
        this.correo_login = correo_login;
    }
    public String getNom_login() {
        return nom_login;
    }
    public void setNom_login(String nom_login) {
        this.nom_login = nom_login;
    }
    public String getApe_login() {
        return ape_login;
    }
    public void setApe_login(String ape_login) {
        this.ape_login = ape_login;
    }

    

}
