package com.musicprofin.demo.dao;

import com.musicprofin.demo.entitys.Contador;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContadorDAO extends JpaRepository<Contador, Long> {
    
}
