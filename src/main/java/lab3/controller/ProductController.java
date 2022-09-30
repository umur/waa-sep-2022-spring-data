package lab3.controller;

import lab3.dto.ProductDto;
import lab3.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/products/{minPrice}")

    public List<ProductDto> findProductsMoreThenMinPrice(@PathVariable Integer minPrice){

        return productService.findProductsMoreThenMinPrice(minPrice);

    }
@GetMapping("/product/{maxprice}")
    public List<ProductDto> findProductsByMaxPrice
        ( @PathVariable Integer maxprice){

        return productService.findProductsByMaxPrice(maxprice);

}

@GetMapping("/prod/{keyword}")

    public List<ProductDto> getProductsContain(@PathVariable String keyword){

       return  productService.getProductsContain(keyword);
}

@GetMapping("produ/{cat}")
    public List<ProductDto> getProductsByCategory(@PathVariable String cat){

        return  productService.getProductsByCategory(cat);
}
}
