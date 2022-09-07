package lab3.service.impl;

import lab3.entity.Product;
import lab3.repo.CategoryRepo;
import lab3.repo.ProductRepo;
import lab3.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl  implements ProductService {
    private ProductRepo productRepo;
    private CategoryRepo categoryRepo;
    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }

    @Override
    public void update(Product product) {
        productRepo.deleteById(product.getId());
        productRepo.save(product);
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> findAll() {
        return  productRepo.findAll();
    }

    @Override
    public List<Product> findProductsByPriceGreaterThan(Double price) {
        return  productRepo.findProductsByPriceGreaterThan(price);
    }

    @Override
    public List<Product> findProductsByCategoryAndPriceLessThan(int categoryId, Double price) {
        return categoryRepo.findById(categoryId)
                .map(category -> productRepo.findProductsByCategoryAndPriceLessThan(category, price))
                .orElseGet(ArrayList::new);
    }

    @Override
    public List<Product> findProductsByNameContains(String name) {
        return  productRepo.findProductsByNameContains(name);
    }
}
