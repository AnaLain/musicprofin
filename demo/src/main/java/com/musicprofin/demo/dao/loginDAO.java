package com.musicprofin.demo.dao;

import com.musicprofin.demo.entitys.login;

import org.springframework.data.jpa.repository.JpaRepository;


public interface loginDAO  extends JpaRepository<login, Long> {
    
}
