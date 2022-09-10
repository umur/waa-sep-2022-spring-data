package com.waa.waalabthree.Service;

import com.waa.waalabthree.Entity.Product;
import com.waa.waalabthree.Repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private IProductRepository iProductRepository;

    public List<Product> getAllProduct(){
        return (List<Product>) iProductRepository.findAll();
    }

    public Optional<Product> getProductById(int id){
        return iProductRepository.findById(id);
    }

    public Product createProduct(Product product){
        return iProductRepository.save(product);
    }

    public void deleteAllProduct(){
        iProductRepository.deleteAll();
    }

    public void deleteProductById(int id){
        iProductRepository.deleteById(id);
    }

    public Product updateProductById(int id, Product product){
        return iProductRepository.save(product);
    }
}
