package com.example.springdata.Controller;

import com.example.springdata.Model.Product;
import com.example.springdata.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/{id}")
    public Product findProductByID(@PathVariable int id) {
        return productService.findProductByID(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product, @RequestParam int id) {
        return productService.updateProduct(id,product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
    }

    @GetMapping("/filter")
    public List<Product> productslessthanminPrice(@RequestParam double price){
        return productService.productslessthanminPrice(price);
    }
    @GetMapping("/filter/{sting}")
    List<Product>findAllProductsContaining(@PathVariable String name){
        return productService.findAllProductsContaining(name);
    }

    @GetMapping("/{categoryid}/{price}")
    List<Product>findProductinCategoryAndPriceLessThan(@PathVariable int categoryid, @PathVariable double price){
        return productService.findProductinCategoryAndPriceLessThan(categoryid, price);
    }
}
