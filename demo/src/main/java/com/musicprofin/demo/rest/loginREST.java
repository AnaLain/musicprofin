package com.musicprofin.demo.rest;

import java.util.List;

import com.musicprofin.demo.dao.loginDAO;
import com.musicprofin.demo.entitys.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("login")
public class loginREST {

    @Autowired
    private loginDAO lDao;

    @GetMapping//actualice producto con BD
    public ResponseEntity<List<login>> getlogin(){
        List<login> Login = lDao.findAll();
        return ResponseEntity.ok(Login);

    }

    /*public ResponseEntity<login> getLogin(){
        login Login = new login();
        Login.setId_login(1L);
        Login.setRut_login("Producto1");
        Login.setContrasena_login("Producto1");
        return ResponseEntity.ok(Login);
    }*/
    

   /*@GetMapping//localhost:7888
    //@RequestMapping(value="hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }*/
}
