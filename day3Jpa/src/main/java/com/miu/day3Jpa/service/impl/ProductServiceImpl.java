package com.miu.day3Jpa.service.impl;

import com.miu.day3Jpa.dto.ProductDTO;
import com.miu.day3Jpa.entity.Product;
import com.miu.day3Jpa.entity.Review;
import com.miu.day3Jpa.repository.ProductRepository;
import com.miu.day3Jpa.repository.ReviewRepository;
import com.miu.day3Jpa.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<ProductDTO> getAllProducts(){
        List<Product> products = (List<Product>) productRepository.findAll();
        System.out.println(products);
        return products.stream().map(product -> modelMapper.map(product,ProductDTO.class)).collect(Collectors.toList());
    }

    public List<ProductDTO> getProductsNameContaining(String keyword){
        List<Product> products= productRepository.findProductByNameContainingIgnoreCase(keyword);
        return products.stream().map(product -> modelMapper.map(product,ProductDTO.class)).collect(Collectors.toList());
    }
    public List<ProductDTO> getProductsMoreThanMinPrice(double minPrice){
        List<Product> products= productRepository.findAllByPriceGreaterThan(minPrice);
        return products.stream().map(product -> modelMapper.map(product,ProductDTO.class)).collect(Collectors.toList());
    }
    public List<ProductDTO> getProductsByCategoryAndMaxPrice(String cat,double maxPrice){
        System.out.println("inside service");
        List<Product> products= productRepository.findAllByCategory_NameAndPriceLessThan(cat,maxPrice);
        return products.stream().map(product -> modelMapper.map(product,ProductDTO.class)).collect(Collectors.toList());
    }
    public List<Review> getListOfProductReview(int id){
        return reviewRepository.findByProductId(id);
    }


}
