package com.musicprofin.demo.rest;

import java.util.List;

import com.musicprofin.demo.dao.ContadorDAO;
import com.musicprofin.demo.entitys.Contador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Contador")
public class ContadorREST {

    @Autowired
    private ContadorDAO cDao;

    @GetMapping//actualice producto con BD
    public ResponseEntity<List<Contador>> getContador(){
        List<Contador> contador =cDao.findAll();
        return ResponseEntity.ok(contador);

    }
    //@GetMapping//localhost:7888
    //@RequestMapping(value="hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }
}
