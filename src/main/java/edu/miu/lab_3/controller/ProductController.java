package edu.miu.lab_3.controller;

import edu.miu.lab_3.dto.ProductDto;
import edu.miu.lab_3.service.imp.ProductServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor

public class ProductController {
    private final ProductServiceImp productService;

    // GET
    @GetMapping
    public List<ProductDto> findAll() {
        return productService.findAll();
    }

    // GET
    @GetMapping("/{id}")
    public ProductDto findProductById(@PathVariable int id) {
        return productService.findProductById(id);
    }

    // POST
    @PostMapping
    public void save(@RequestBody ProductDto productDto) {
        productService.save(productDto);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteById(id);
    }

    // PUT
    @PutMapping("/{id}")
    public ProductDto updateProduct(@PathVariable int id, ProductDto productDto) {
        productService.deleteById(id);
        productService.save(productDto);
        return productDto;
    }

    //Get _greaterThan minPrice
    @GetMapping("/filter")
    public List<ProductDto> findByPriceGreaterThan(@RequestParam double minPrice) {
        return productService.findByPriceGreaterThan(minPrice);
    }

    // Get product in cat less than maxPrice

    @GetMapping("/filter/{category_id}")
    public List<ProductDto> findByCategoryAndPriceLessThan(@PathVariable int category_id, @RequestParam double price) {
        return productService.findByCategoryAndPriceLessThan(price);
    }

    // Get product with keyword in the name
    @GetMapping("/search")
    public List<ProductDto> findByNameContains(@RequestParam String keyword) {
        return productService.findByNameContains(keyword);
    }
    // GET review by product id

    @GetMapping("/user/{id}")
    public List<ProductDto> getByUserId(@PathVariable int id){
        /*
        Find reviews of the product whose id is id.

        * */
        return null;
    }

}
