package com.springdata.springdata.controller;

import com.springdata.springdata.DTOs.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.springdata.springdata.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ProductDTO save(@RequestBody ProductDTO product) {
        return productService.save(product);
    }

    @GetMapping
    public List<ProductDTO> findAll() {
        return productService.findAll();
    }

    @PutMapping("/{id}")
    public ProductDTO update(@PathVariable int id, @RequestBody ProductDTO product) {
        return productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public ProductDTO delete(@PathVariable int id) {
        return productService.delete(id);
    }
}
