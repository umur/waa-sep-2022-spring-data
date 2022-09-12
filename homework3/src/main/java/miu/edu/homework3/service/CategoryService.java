package miu.edu.homework3.service;

import miu.edu.homework3.dto.CategoryDTO;
import miu.edu.homework3.dto.ProductDTO;

import java.util.List;

public interface CategoryService {
    void save(CategoryDTO categoryDTO);
    List<CategoryDTO> findAll();
    CategoryDTO findById(int id);
    void delete(int id);

    interface ProductService {
        void save(ProductDTO productDTO);

        List<ProductDTO> findAll();
        ProductDTO getById(int id);
        void  delete(int id );
    }
}
