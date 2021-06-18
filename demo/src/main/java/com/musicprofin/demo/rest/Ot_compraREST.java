package com.musicprofin.demo.rest;

import java.util.List;

import com.musicprofin.demo.dao.Ot_compraDAO;
import com.musicprofin.demo.entitys.Ot_compra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Ot_compra")
public class Ot_compraREST {
    
    @Autowired
    private Ot_compraDAO otDao;

    @GetMapping//actualice producto con BD
    public ResponseEntity<List<Ot_compra>> getOt_compra(){
        List<Ot_compra> ot_compras =otDao.findAll();
        return ResponseEntity.ok(ot_compras);

    }

    //@GetMapping//localhost:7888
    //@RequestMapping(value="hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }
}
