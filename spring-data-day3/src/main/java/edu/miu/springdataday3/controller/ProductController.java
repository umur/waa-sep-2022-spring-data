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
    @GetMapping("/{id}/{price}")
    public List<Product> findProductsInCategoryByPriceLessThan(@PathVariable int id, @PathVariable int price) {
        return productService.findProductsInCategoryByPriceLessThan(id,price);
    }

    @PostMapping
    void createNewProduct(@RequestBody Product product){
        productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        productService.deleteById(id);
    }
}
