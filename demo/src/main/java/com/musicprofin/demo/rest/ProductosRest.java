package com.musicprofin.demo.rest;

import java.util.List;
import java.util.Optional;

//import javax.persistence.Entity;

import com.musicprofin.demo.dao.ProductsDAO;
import com.musicprofin.demo.entitys.productos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductosRest {

    @Autowired
    private ProductsDAO prodDao;

    

    @GetMapping//actualice producto con BD
    public ResponseEntity<List<productos>> getProductos(){
        List<productos> products =prodDao.findAll();
        return ResponseEntity.ok(products);

    }

    @RequestMapping(value="{productosId}")// PRODUCTO INDIVIDUAL
    public ResponseEntity<productos> getProductosById(@PathVariable("productosId") Long productosId){
        Optional<productos> optionalProductos = prodDao.findById(productosId);
        if(optionalProductos.isPresent()){
            return ResponseEntity.ok(optionalProductos.get());
        }else{
            return ResponseEntity.noContent().build();
            }
        }

    // traer un nyuevo valor a BD
    @PostMapping
    public ResponseEntity<productos> createProduct(@RequestBody productos productos){
        productos newProducts = prodDao.save(productos);
        return ResponseEntity.ok(newProducts);
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
