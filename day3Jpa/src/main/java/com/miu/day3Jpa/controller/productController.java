package com.miu.day3Jpa.controller;

import com.miu.day3Jpa.dto.ProductDTO;
import com.miu.day3Jpa.dto.ReviewDTO;
import com.miu.day3Jpa.entity.Review;
import com.miu.day3Jpa.service.ProductService;
import com.miu.day3Jpa.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.miu.day3Jpa.entity.Product;

import java.util.List;

@RestController
@RequestMapping("/products")
public class productController {
    @Autowired
    ProductServiceImpl productServiceImpl;
    @GetMapping
    public List<ProductDTO> getAllProduct(){
            return productServiceImpl.getAllProducts();
    };
    @GetMapping("/filter")
    public List<ProductDTO> getSpecificProducts(@RequestParam(required = false) String keyword ,@RequestParam(required = false) Double minPrice,@RequestParam(required = false) String cat, @RequestParam(required = false)Double maxPrice){

        if (keyword !=null) {
            return productServiceImpl.getProductsNameContaining(keyword);
        }
        else if( maxPrice != null && cat != null){
            System.out.println("here");
            return productServiceImpl.getProductsByCategoryAndMaxPrice(cat,maxPrice);
        }
        return productServiceImpl.getProductsMoreThanMinPrice(minPrice);
    };
    @GetMapping("/reviews/{id}")
    public List<Review> getProductReview(@PathVariable int id){
        return productServiceImpl.getListOfProductReview(id);
    }


    @PostMapping
    public void saveProduct(ProductDTO product){
    }
    @PutMapping
    public void updateProduct(@PathVariable int id,@RequestBody ProductDTO product){
    }
    @DeleteMapping
    public void updateProduct(@PathVariable int id){
    }

}
