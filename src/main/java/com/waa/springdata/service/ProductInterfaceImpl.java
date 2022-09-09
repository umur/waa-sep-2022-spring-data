package com.waa.springdata.service;

import com.waa.springdata.entity.Product;
import com.waa.springdata.repo.ProductRepo;
import com.waa.springdata.service.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInterfaceImpl implements ProductInterface {

    @Autowired
    private ProductRepo productRepo;

    //@Override
    public Product saveProduct(Product p){
        return productRepo.save(p);
    }

    //@Override
    public Product getProduct(int id){
        return productRepo.findById(id);
    }

    public Product updateProduct(Product product){
        return productRepo.save(product);
    }

    public void deleteProduct(int id){
        productRepo.deleteById(id);
    }
   // @Override
    public List<Product> findByPrice(int price) {
        return productRepo.findAllByPriceGreaterThan(price);
    }

    //@Override
    public List<Product> findByRating(double rate){
        return productRepo.findAllProductsByRating(rate);
    }

    public List<Product> getAllProduct(){
        return this.productRepo.findAll();
    }
}
