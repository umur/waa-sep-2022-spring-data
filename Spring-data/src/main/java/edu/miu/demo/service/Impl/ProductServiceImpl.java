package edu.miu.demo.service.Impl;

import edu.miu.demo.domain.Product;
import edu.miu.demo.dto.ProductDto;
import edu.miu.demo.repo.ProductRepo;
import edu.miu.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Type;
import java.util.List;

@AllArgsConstructor
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepo productRepository;
    private ModelMapper modelMapper;


    @Override
    public List<ProductDto> findAll() {
        var products = productRepository.findAll();
        Type listType = new TypeToken<List<ProductDto>>(){}.getType();
        return modelMapper.map(products,listType);
    }

    @Override
    public ProductDto findById(int id) {
        var product  = productRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("ProductDto with id %s does not exits",id)));
        ProductDto productDto = modelMapper.map(product, ProductDto.class);
        return productDto;
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        return modelMapper.map(productRepository.save(product), ProductDto.class);
    }

    @Override
    public void remove(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<ProductDto> findAllByPriceGreaterThan(Double minPrice) {
        var products = productRepository.findAllByPriceGreaterThan(minPrice);
        Type listType = new TypeToken<List<ProductDto>>(){}.getType();
        return modelMapper.map(products,listType);
    }

    @Override
    public List<ProductDto> findByCategoryNameAndPriceLessThan(String categoryName, Double maxPrice) {
        var products = productRepository.findByCategoryNameAndPriceLessThan(categoryName,maxPrice);
        Type listType = new TypeToken<List<ProductDto>>(){}.getType();
        return modelMapper.map(products,listType);
    }

    @Override
    public List<ProductDto> findAllByNameContains(String keyword) {
        var products = productRepository.findAllByNameContains(keyword);
        Type listType = new TypeToken<List<ProductDto>>(){}.getType();
        return modelMapper.map(products,listType);
    }

}
