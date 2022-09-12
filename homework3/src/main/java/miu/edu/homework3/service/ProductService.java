package miu.edu.homework3.service;

import miu.edu.homework3.dto.ProductDTO;
import miu.edu.homework3.entity.Product;

import java.util.List;

public interface ProductService {
    void save(ProductDTO productDTO);

    List<ProductDTO> findAll();

    ProductDTO getById(int id);

    void delete(int id);
}
