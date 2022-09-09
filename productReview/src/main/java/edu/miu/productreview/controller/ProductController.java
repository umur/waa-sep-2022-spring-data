package edu.miu.productreview.controller;

import edu.miu.productreview.domain.Product;
import edu.miu.productreview.dto.ProductDto;
import edu.miu.productreview.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productSvc;

    @GetMapping
    public List<ProductDto> findAll() {
        return productSvc.findAll();
    }

    @GetMapping("/{id}")
    public ProductDto findById(@PathVariable int id) {
        return productSvc.findById(id);
    }

    @PostMapping
    public ProductDto save(@RequestBody ProductDto product) {
        return productSvc.save(product);
    }

    @PutMapping("/{id}")
    public ProductDto update(@PathVariable int id, @RequestBody ProductDto product) {
        return productSvc.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productSvc.delete(id);
    }

    @GetMapping("/filter-by-minprice")
    public List<ProductDto> findAllByPriceGreaterThan(@RequestParam (required = true) Float price) {
        return productSvc.findAllByPriceGreaterThan(price);
    }

    @GetMapping("/filter-by-cat-and-maxprice")
    public List<ProductDto> findAllByCategoryAndPriceLessThan(
            @RequestParam String cat,
            @RequestParam Float price) {
        return productSvc.findAllByCategoryAndPriceLessThan(cat, price);
    }

    @GetMapping("/filter-by-name")
    public List<ProductDto> findAllByNameContaining(@RequestParam String keyword) {
        return productSvc.findAllByNameContaining(keyword);
    }
}
