package com.example.springdata.Service.Impl;

import com.example.springdata.Model.Category;
import com.example.springdata.Model.Product;
import com.example.springdata.Repository.ProductRepo;
import com.example.springdata.Service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo){
        this.productRepo=productRepo;
    }

    @Override
    public List<Product> findAllProducts() {
        return (List<Product>) productRepo.findAll();
    }

    @Override
    public Product findProductByID(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(int id, Product product) {
       Optional<Product> updateproduct = productRepo.findById(id);
       if(updateproduct.isPresent()){
           updateproduct.get().setPrice(product.getPrice());
           updateproduct.get().setCategory(product.getCategory());
           updateproduct.get().setRating(product.getRating());
        return productRepo.save(updateproduct.get());
       }
    return null;
    }

    @Override
    public void deleteProductById(int id) {

    }
    @Override
    public List<Product> productslessthanminPrice(double price){
      return productRepo.findProductByPriceLessThan(price);
    }

    @Override
    public List<Product> findProductinCategoryAndPriceLessThan(int categoryid, double price) {
        return productRepo.findProductinCategoryAndPriceLessThan(categoryid,price);
    }

    @Override
    public List<Product> findAllProductsContaining(String name) {
        return (List) productRepo.findByNameContaining(name);
    }


}
