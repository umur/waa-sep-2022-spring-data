package edu.miu.springdatademo.service;

import edu.miu.springdatademo.dto.ProductDTO;
import java.util.List;

public interface ProductService {
    void save(ProductDTO productDTO);
    List<ProductDTO> findAll();
    ProductDTO getById(int id);

    void delete(int id);
}
