package com.musicprofin.demo.dao;

import com.musicprofin.demo.entitys.Bodega;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BodegaDAO extends JpaRepository<Bodega, Long> {
    
}
