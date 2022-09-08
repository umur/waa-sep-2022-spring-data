package edu.miu.lab3springdata.service.impl;

import edu.miu.lab3springdata.dto.ProductDto;
import edu.miu.lab3springdata.entity.Category;
import edu.miu.lab3springdata.entity.Product;
import edu.miu.lab3springdata.exception.NotFoundException;
import edu.miu.lab3springdata.mapper.ProductMapper;
import edu.miu.lab3springdata.repo.CategoryRepository;
import edu.miu.lab3springdata.repo.ProductRepository;
import edu.miu.lab3springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    private final CategoryRepository categoryRepository;

    private final ProductRepository productRepository;

    @Override
    public List<ProductDto> getProducts() {
        return productMapper.toDtos((List<Product>) productRepository.findAll());
    }

    @Transactional
    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void add(int categoryId, ProductDto productDto) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new NotFoundException("Cannot find category: " + categoryId));
        Product product = productMapper.toEntity(productDto);
        product.setCategory(category);
        productRepository.save(product);
    }

    @Override
    public List<ProductDto> findByPrice(Double minPrice) {
        return productMapper.toDtos(productRepository.findProductsByPriceGreaterThanEqual(minPrice));
    }

    @Override
    public List<ProductDto> findByCategoryAndMaxPrice(int categoryId, Double maxPrice) {
        return productMapper.toDtos(productRepository.findProductsByCategory_IdAndPriceLessThanEqual(categoryId, maxPrice));
    }
}
