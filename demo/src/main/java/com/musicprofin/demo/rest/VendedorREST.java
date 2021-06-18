package com.musicprofin.demo.rest;

import java.util.List;

import com.musicprofin.demo.dao.VendedorDAO;
import com.musicprofin.demo.entitys.Vendedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Vendedor")
public class VendedorREST {

    @Autowired
    private VendedorDAO vDao;

    @GetMapping//actualice producto con BD
    public ResponseEntity<List<Vendedor>> getVendedor(){
        List<Vendedor> vendedor = vDao.findAll();
        return ResponseEntity.ok(vendedor);

    }

    //@GetMapping//localhost:7888
    //@RequestMapping(value="hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }
}
