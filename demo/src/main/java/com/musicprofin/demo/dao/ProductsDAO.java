package com.musicprofin.demo.dao;

import com.musicprofin.demo.entitys.productos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsDAO extends JpaRepository<productos, Long>{
    
}
