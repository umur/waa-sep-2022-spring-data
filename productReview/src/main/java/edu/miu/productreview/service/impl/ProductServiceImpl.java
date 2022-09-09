package edu.miu.productreview.service.impl;

import edu.miu.productreview.domain.Category;
import edu.miu.productreview.domain.Product;
import edu.miu.productreview.dto.ProductDto;
import edu.miu.productreview.mapper.ProductMapper;
import edu.miu.productreview.repo.CategoryRepo;
import edu.miu.productreview.repo.ProductRepo;
import edu.miu.productreview.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;

    private final CategoryRepo categoryRepo;
    private final ProductMapper productMapper;
    @Override
    public ProductDto save(ProductDto product) {
        Product result = productRepo.save(productMapper.toEntity(product));
        return productMapper.toDto(result);
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public ProductDto findById(int id) {
        return productRepo.findById(id)
                .map(productMapper::toDto)
                .orElse(new ProductDto());
//        return productRepo.findById(id)
//                .map(product -> mapper.map(product, ProductDto.class))
//                .orElse(new ProductDto());
    }

    @Override
    public ProductDto update(int id, ProductDto product) {
        if(productRepo.existsById(id)) {
            product.setId(id);
            return this.save(product);
        } else {
            throw new NoResultException();
        }
    }

    @Override
    public List<ProductDto> findAll() {
        List<Product> products = new ArrayList<>();
        productRepo.findAll().forEach(products::add);
        return productMapper.toDtos(products);
    }

    @Override
    public List<ProductDto> findAllByPriceGreaterThan(Float minPrice) {
        List<Product> products = new ArrayList<>();
        productRepo.findAllByPriceGreaterThan(minPrice)
                .forEach(products::add);
        return productMapper.toDtos(products);
    }

    @Override
    public List<ProductDto> findAllByCategoryAndPriceLessThan(String cat, Float maxPrice) {
        List<Product> products = new ArrayList<>();
        Category category = categoryRepo.findByName(cat);
        productRepo.findAllByCategoryAndPriceLessThan(category, maxPrice)
                .forEach(products::add);
        return productMapper.toDtos(products);
    }

    @Override
    public List<ProductDto> findAllByNameContaining(String keyword) {
        List<Product> products = new ArrayList<>();
        productRepo.findAllByNameContaining(keyword)
                .forEach(products::add);
        return productMapper.toDtos(products);
    }
}
