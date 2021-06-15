package com.musicprofin.demo.rest;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductosRest {
    
    //@GetMapping//localhost:7888
    @RequestMapping(value="hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }
}
