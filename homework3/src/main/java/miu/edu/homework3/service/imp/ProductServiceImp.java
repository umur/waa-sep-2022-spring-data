package miu.edu.homework3.service.imp;


import miu.edu.homework3.dto.ProductDTO;
import miu.edu.homework3.entity.Product;
import miu.edu.homework3.repo.ProductRepo;
import miu.edu.homework3.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    private ProductRepo productRepo;
    private ModelMapper mapper;

    @Autowired
    public ProductServiceImp(ProductRepo productRepo , ModelMapper mapper){
        this.productRepo = productRepo;
        this.mapper = mapper;
    }

    @Override
    public void save(ProductDTO productDTO){
        Product product = mapper.map(productDTO, Product.class);
        productRepo.save(product);
    }

    @Override
    public List<ProductDTO> findAll(){
        List<Product> products = productRepo.findAll();
        List<ProductDTO> productDTOs = new ArrayList<>();

        products.forEach(p -> {
            var productDTO = mapper.map(p, ProductDTO.class);
            productDTOs.add(productDTO);

        });
    return productDTOs;
    }

    @Override
    public ProductDTO getById(int id) {
        Product product = productRepo.findById(id).orElse(null);
        ProductDTO productDTO = mapper.map(product,ProductDTO.class);
        return productDTO;
    }

    @Override
    public void delete(int id){
        productRepo.deleteById(id);
    }

}
