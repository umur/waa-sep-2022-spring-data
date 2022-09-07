package lab3.controller;

import lab3.dto.ProductDTO;
import lab3.entity.Product;
import lab3.service.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductServiceImpl service;

    private final ModelMapper mapper;

    @GetMapping
    public List<ProductDTO> getAll() {
        return service.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }



    @PostMapping
    public ProductDTO save(@RequestBody Product product) {
        return this.toDTO(service.save(product));
    }

    @PutMapping("/{id}")
    public ProductDTO update(@PathVariable int id, @RequestBody Product product) {
        product.setId(id);
        return this.toDTO(service.save(product));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("filterByPrice")
    public List<ProductDTO> getByMinPrice(@RequestParam Double price) {
        return service.findProductsByPriceGreaterThan(price)
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("filter-category-max-price")
    public List<ProductDTO> getByCategoryAndMaxPrice(@RequestParam int id, @RequestParam Double price) {
        return service.findProductsByCategoryAndPriceLessThan(id, price)
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("filter-by-name")
    public List<ProductDTO> getMyNameContains(@RequestParam String name) {
        return service.findProductsByNameContains(name)
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    private ProductDTO toDTO(Product product) {
        return mapper.map(product, ProductDTO.class);
    }

    private Product toEntity(ProductDTO product) {
        return mapper.map(product, Product.class);
    }
}
