package com.musicprofin.demo.rest;

import java.util.List;

import com.musicprofin.demo.dao.BodegaDAO;
import com.musicprofin.demo.entitys.Bodega;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Bodega")
public class BodegaREST {

    @Autowired
    private BodegaDAO bDao;

    @GetMapping//actualice producto con BD
    public ResponseEntity<List<Bodega>> getBodega(){
        List<Bodega> bodega =bDao.findAll();
        return ResponseEntity.ok(bodega);

    }
    
    //@GetMapping//localhost:7888
    //@RequestMapping(value="hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }
}
