package com.waa.springdata.controller;

import com.waa.springdata.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.waa.springdata.service.ProductInterfaceImpl;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    private  ProductInterfaceImpl productService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Product createProduct(@RequestBody Product product){
        return this.productService.saveProduct(product);
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id){
        return this.productService.getProduct(id);
    }
    @GetMapping()
    public List<Product> getAllProduct(){
        return this.productService.getAllProduct();
    }

    @PutMapping()
    public Product updateProduct(@RequestBody Product product){
        return this.productService.updateProduct(product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
    }
}
