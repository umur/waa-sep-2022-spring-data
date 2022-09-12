package miu.edu.homework3.controller;

import miu.edu.homework3.dto.CategoryDTO;
import miu.edu.homework3.dto.ProductDTO;
import miu.edu.homework3.service.CategoryService;
import miu.edu.homework3.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/category")
@Transactional
public class ProductController {

    private ProductService productService;

    private ModelMapper mapper;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    public void  save(@RequestBody ProductDTO productDTO){
        productService.save(productDTO);
    }

    @GetMapping
    public List<ProductDTO> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public  ProductDTO getById (@PathVariable Integer id){
        return productService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void  delete(@PathVariable Integer id) {
        productService.delete(id);
    }


}
