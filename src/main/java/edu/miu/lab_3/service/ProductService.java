package edu.miu.lab_3.service;

import edu.miu.lab_3.dto.ProductDto;
import edu.miu.lab_3.entity.Product;

import java.util.List;


public interface ProductService {
    public Product save(ProductDto productDto);
    public void update(int id, ProductDto productDto);
    public List<ProductDto> findAll();
    void deleteById(int id);
    ProductDto findProductById(int id);
    public List<ProductDto> findByPriceGreaterThan(float price);
    List<ProductDto> findByCategoryAndPriceLessThan(float price);
    List<ProductDto> findByNameContains(String keyword);






}
