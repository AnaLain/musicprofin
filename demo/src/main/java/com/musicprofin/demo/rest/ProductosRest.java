package com.musicprofin.demo.rest;

import java.util.List;

import com.musicprofin.demo.dao.ProductsDAO;
import com.musicprofin.demo.entitys.productos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductosRest {

    @Autowired
    private ProductsDAO prodDao;

    

    @GetMapping
    public ResponseEntity<List<productos>> getProductos(){
        List<productos> products =prodDao.findAll();
        return ResponseEntity.ok(products);

    }
    /*public ResponseEntity<productos> getProductos(){
        productos producto = new productos();
        producto.setId(1L);
        producto.setName("Producto1");
        return ResponseEntity.ok(producto);
    }*/
    
    //@GetMapping//localhost:7888
    //@RequestMapping(value="hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }
}
