package com.waa.waalabthree.Controller;

import com.waa.waalabthree.Entity.Product;
import com.waa.waalabthree.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/allProduct")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/allProduct/{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping("/allProduct")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @DeleteMapping("/allProduct")
    public void deleteAllProduct(){
        productService.deleteAllProduct();
    }

    @DeleteMapping("/allProduct/{id}")
    public void deleteProductById(@PathVariable int id){
        productService.deleteProductById(id);
    }

    @PutMapping("/allProduct/{id}")
    public Product updateProductById(@PathVariable int id, @RequestBody Product product){
        return productService.updateProductById(id, product);
    }
}
