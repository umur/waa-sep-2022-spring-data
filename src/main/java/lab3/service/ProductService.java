package lab3.service;

import lab3.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findProductsMoreThenMinPrice(Integer minPrice);

    List<ProductDto> findProductsByMaxPrice(Integer maxprice);

    List<ProductDto> getProductsContain(String keyword);

    List<ProductDto> getProductsByCategory(String cat);
}
