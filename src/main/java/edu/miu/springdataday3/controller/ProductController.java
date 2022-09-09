package edu.miu.springdataday3.controller;

import edu.miu.springdataday3.entity.dto.ProductDTO;
import edu.miu.springdataday3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    //get
    @GetMapping
    public List<ProductDTO> getAll(){
        return productService.getAll();
    }

    //post
    @PostMapping
    public ProductDTO create(@RequestBody ProductDTO productDTO){
        return productService.create(productDTO);
    }

    //put
    @PutMapping("/{id}")
    public ProductDTO update(@PathVariable Long id, @RequestBody ProductDTO productDTO){
        return productService.update(id, productDTO);
    }

    //delete
    @DeleteMapping("/{id}")
    public ProductDTO delete(@PathVariable Long id){
        return productService.delete(id);
    }

    // more than minPrice
    @GetMapping("/minprice/{price}")
    public List<ProductDTO> minPrice(@PathVariable Long price){
        return productService.minPrice(price);
    }
}
