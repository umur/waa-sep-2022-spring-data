package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.dto.ProductDTO;
import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.repo.ProductRepo;
import edu.miu.springdatademo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<ProductDTO> getAllProduct() {
//        List<Pr>



        return null;
    }

    @Override
    public ProductDTO getProductById() {
        return null;
    }

    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO, Integer id) {
        return null;
    }

    @Override
    public ProductDTO deleteProduct(Integer id) {
        return null;
    }

    @Override
    public List<ProductDTO> getProductsByMinPrice(Integer minPrice) {
        List<Product> products = productRepo.findAllByPriceGreaterThan(minPrice);

        return products.stream().map(product -> modelMapper.map(product,ProductDTO.class)).collect(Collectors.toList());
    }
}
