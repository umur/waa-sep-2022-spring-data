package edu.miu.springdatademo.controller;

import edu.miu.springdatademo.dto.ProductDTO;
import edu.miu.springdatademo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/filter")
    public List<ProductDTO> getProductsByMinPrice(@RequestParam Integer minPrice){
        return productService.getProductsByMinPrice(minPrice);
    }


}
