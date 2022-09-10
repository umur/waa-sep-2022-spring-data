package com.waa.springdata.controller;

import com.waa.springdata.dto.ProductDTO;
import com.waa.springdata.entity.Product;
import com.waa.springdata.service.impl.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {
    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @PostMapping
    public void save(@RequestBody ProductDTO productDTO) {
        productService.save(productDTO);
    }

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable long id) {
        return productService.findById(id);
    }

    @GetMapping(value = "/filter", params = "minPrice")
    public List<Product> findByMinimumPrice(@RequestParam double minPrice) {
        return productService.findProductByPriceGreaterThan(minPrice);
    }

    @GetMapping(value = "/filter", params = "keyword")
    public List<Product> findByProductName(@RequestParam String keyword) {
        return productService.findProductByNameContaining(keyword);
    }

    @GetMapping(value = "/filter", params = {"categoryId", "maxPrice"})
    public List<Product> findByCategoryAndPrice(@RequestParam long categoryId, double maxPrice) {
        return productService.findProductByCategoryIdAndPriceLessThan(categoryId, maxPrice);
    }
}
