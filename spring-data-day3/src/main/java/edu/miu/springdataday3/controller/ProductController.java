package edu.miu.springdataday3.controller;

import edu.miu.springdataday3.entitiy.Product;
import edu.miu.springdataday3.repo.ProductRepo;
import edu.miu.springdataday3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    List<Product> getAllProducts(){
        return productService.findAll();
    }

    @GetMapping("/filter")
    List<Product> findAllByNameContaining(@RequestParam String name){
        return productService.findAllByNameContaining(name);
    }

    @GetMapping("/{price}")
    public List<Product> findAllByPriceGreaterThan(@PathVariable double price) {
        return productService.findAllByPriceGreaterThan(price);
    }

    @PostMapping
    void createNewProduct(@RequestBody Product product){
        productService.save(product);
    }
}
