package com.musicprofin.demo.rest;

import java.util.List;

import com.musicprofin.demo.dao.ClienteDAO;
import com.musicprofin.demo.entitys.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Cliente")
public class ClienteREST {

    @Autowired
    private ClienteDAO cliDao ;

    @GetMapping//actualice producto con BD
    public ResponseEntity<List<Cliente>> getCliente(){
        List<Cliente> cliente =cliDao.findAll();
        return ResponseEntity.ok(cliente);

    }
    
    //@GetMapping//localhost:7888
    //@RequestMapping(value="hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }
}
