package edu.miu.service.impl;

import edu.miu.annotation.ExecutionTime;
import edu.miu.dto.ProductDTO;
import edu.miu.entity.Product;
import edu.miu.entity.User;
import edu.miu.repo.ProductRepo;
import edu.miu.security.impl.AuthenticationFacadeImpl;
import edu.miu.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ModelMapper modelMapper;
    private final ProductRepo productRepo;

    private final AuthenticationFacadeImpl authenticationFacade;

    public ProductServiceImpl(ModelMapper modelMapper, ProductRepo productRepo, AuthenticationFacadeImpl authenticationFacade) {
        this.modelMapper = modelMapper;
        this.productRepo = productRepo;
        this.authenticationFacade = authenticationFacade;
    }

    @ExecutionTime
    @Override
    public void save(ProductDTO productDTO) {
        Authentication authentication = authenticationFacade.getAuthentication();
        User user = (User) authentication.getDetails();
        Product product = modelMapper.map(productDTO, Product.class);
        product.setUser(user);
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
