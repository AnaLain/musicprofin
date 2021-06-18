package com.musicprofin.demo.dao;

import com.musicprofin.demo.entitys.Vendedor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorDAO  extends JpaRepository<Vendedor, Long>{

}
