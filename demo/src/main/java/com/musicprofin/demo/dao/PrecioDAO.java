package com.musicprofin.demo.dao;

import com.musicprofin.demo.entitys.Precio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PrecioDAO extends JpaRepository<Precio, Long> {
    
}
