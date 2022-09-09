package edu.miu.lab_3.service.imp;

import lombok.RequiredArgsConstructor;
import edu.miu.lab_3.dto.ProductDto;
import edu.miu.lab_3.entity.Product;
import edu.miu.lab_3.repo.ProductRepo;
import edu.miu.lab_3.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {
    private final ProductRepo productRepo;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public Product save(ProductDto productDto) {

        return productRepo.save(modelMapper.map(productDto, Product.class));

    }

    @Override
    public List<ProductDto> findAll() {
        return null;
    }

    @Override
    public ProductDto findProductById(int id) {
        return null;
    }

    @Override
    public List<ProductDto> findByPriceGreaterThan(double price) {
        return null;
    }

    @Override
    public List<ProductDto> findByCategoryAndPriceLessThan(double price) {
        return null;
    }

    @Override
    public List<ProductDto> findByNameContains(String keyword) {
        return null;
    }

    @Override
    public void deleteById( int id) {

    }
}
