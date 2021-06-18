package com.musicprofin.demo.rest;

import java.util.List;

import com.musicprofin.demo.dao.PrecioDAO;
import com.musicprofin.demo.entitys.Precio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Precio")
public class PrecioREST {

    @Autowired
    private PrecioDAO pDao;

    @GetMapping//actualice producto con BD
    public ResponseEntity<List<Precio>> getPrecio(){
        List<Precio> precio =pDao.findAll();
        return ResponseEntity.ok(precio);

    }


    //@GetMapping//localhost:7888
    //@RequestMapping(value="hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }
}
