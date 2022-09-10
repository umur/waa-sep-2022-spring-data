package com.example.springdata.Service;

import com.example.springdata.Model.Category;
import com.example.springdata.Model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAllProducts();
    public Product findProductByID(int id);
    public Product addProduct(Product product);
    public Product updateProduct(int id, Product product);
    public void deleteProductById(int id);
    public List<Product> productslessthanminPrice(double price);
    List<Product>findProductinCategoryAndPriceLessThan(int categoryid, double price);

    List<Product>findAllProductsContaining(String name);
}
