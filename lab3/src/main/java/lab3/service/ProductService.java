package lab3.service;

import lab3.entity.Product;
import lab3.entity.Review;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    public void update(Product product);
    public void delete(int id);
    public List<Product> findAll();


    List<Product> findProductsByPriceGreaterThan(Double price);

    List<Product> findProductsByCategoryAndPriceLessThan(int categoryId, Double price);

    List<Product> findProductsByNameContains(String word);
}
