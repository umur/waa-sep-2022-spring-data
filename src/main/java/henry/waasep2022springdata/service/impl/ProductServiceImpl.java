package henry.waasep2022springdata.service.impl;

import henry.waasep2022springdata.dto.ProductDto;
import henry.waasep2022springdata.entity.Product;
import henry.waasep2022springdata.mapper.ListMapper;
import henry.waasep2022springdata.repo.ProductRepo;
import henry.waasep2022springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;
    private final ListMapper listMapper;

    @Override
    public void save(ProductDto productDto) {
        productRepo.save(modelMapper.map(productDto, Product.class));
    }

    @Override
    public List<ProductDto> findAll() {
        return listMapper.map((List<Product>)productRepo.findAll(), ProductDto.class);
    }

    @Override
    public void update(int productId, ProductDto productDto) {
        Product product = productRepo.findById(productId).orElse(null);
        if (product != null) {
            Product newProduct = modelMapper.map(productDto, Product.class);
            newProduct.setId(productId);
            productRepo.save(newProduct);
        }
    }

    @Override
    public ProductDto delete(int productId) {
        Product product = productRepo.findById(productId).orElse(null);
        productRepo.deleteById(productId);
        return product != null ? modelMapper.map(product, ProductDto.class) : null;
    }

    @Override
    public List<ProductDto> findWithMinPrice(double minPrice) {
        return listMapper.map(productRepo.findProductsByPriceGreaterThan(minPrice), ProductDto.class);
    }

    @Override
    public List<ProductDto> findWithName(String keyword) {
        return listMapper.map(productRepo.findProductsByNameContains(keyword), ProductDto.class);
    }

    @Override
    public List<ProductDto> findWithCategoryAndMaxPrice(int categoryId, double maxPrice) {
        return listMapper.map(productRepo.findProductsByCategory_IdAndPriceLessThan(categoryId, maxPrice), ProductDto.class);
    }
}
