package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.dto.ProductDTO;
import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.repo.ProductRepo;
import edu.miu.springdatademo.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepo productRepo;
    private ModelMapper mapper;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo, ModelMapper mapper) {
        this.productRepo = productRepo;
        this.mapper = mapper;
    }

    @Override
    public void save(ProductDTO productDTO) {
        Product product = mapper.map(productDTO, Product.class);
        productRepo.save(product);
    }

    @Override
    public List<ProductDTO> findAll() {
        List<Product> products = productRepo.findAll();
        List<ProductDTO> productDTOs = new ArrayList<>();

        products.forEach(product -> {
            var productDTO = mapper.map(product, ProductDTO.class);
            productDTOs.add(productDTO);
        });

        return productDTOs;
    }

    @Override
    public ProductDTO getById(int id) {
        Product product = productRepo.findById(id).orElse(null);
        ProductDTO productDTO = mapper.map(product, ProductDTO.class);
        return productDTO;
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }
}
