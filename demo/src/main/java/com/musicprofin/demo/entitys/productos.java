package com.musicprofin.demo.entitys;

public class productos {
    
    private Long id;
    private String name;
    private String Categoria;
    private int cantidad;
    private int valor;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategoria() {
        return Categoria;
    }
    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    
}
