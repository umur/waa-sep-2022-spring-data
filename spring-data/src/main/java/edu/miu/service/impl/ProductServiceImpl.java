package edu.miu.service.impl;

import edu.miu.annotation.ExecutionTime;
import edu.miu.dto.ProductDTO;
import edu.miu.entity.Product;
import edu.miu.repo.ProductRepo;
import edu.miu.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ModelMapper modelMapper;
    private final ProductRepo productRepo;

    public ProductServiceImpl(ModelMapper modelMapper, ProductRepo productRepo) {
        this.modelMapper = modelMapper;
        this.productRepo = productRepo;
    }

    @ExecutionTime
    @Override
    public void save(ProductDTO productDTO) {
        productRepo.save(modelMapper.map(productDTO, Product.class));
    }

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product findById(long id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public List<Product> findProductByPriceGreaterThan(double minPrice) {
        return productRepo.findProductByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findProductByNameContaining(String keyword) {
        return productRepo.findProductByNameContaining(keyword);
    }

    @Override
    public List<Product> findProductByCategoryIdAndPriceLessThan(long categoryId, double maxPrice) {
        return productRepo.findProductByCategoryIdAndPriceLessThan(categoryId, maxPrice);
    }
}
