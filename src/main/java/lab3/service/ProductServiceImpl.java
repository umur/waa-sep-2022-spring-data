package lab3.service;

import lab3.dto.ProductDto;
import lab3.entity.ProductEntity;
import lab3.repository.ProductRep;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements  ProductService{
    @Autowired
    private ProductRep productRep;
    @Autowired
    private ModelMapper mapper;

    @Override
    public List<ProductDto> findProductsMoreThenMinPrice(Integer minPrice) {


        return productRep.findAllByPriceGreaterThan(minPrice)
                .stream()
                .map(p->mapper.map(p,ProductDto.class))
                .toList();

    }

    @Override
    public List<ProductDto> findProductsByMaxPrice( Integer maxprice) {
        return productRep.findAllByPriceLessThan(maxprice)
                .stream().map(p->mapper.map(p,ProductDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> getProductsContain(String keyword) {
        List<ProductEntity> listOfProducts=productRep.findAllByNameContaining(keyword);

        return listOfProducts
                .stream()
                .map(p->mapper.map(p,ProductDto.class))
                .toList();

    }

    @Override
    public List<ProductDto> getProductsByCategory(String cat) {
        List<ProductEntity> listOfProducts =productRep.findByProductsByCategory(cat);
        return listOfProducts.stream().map(p->mapper.map(p,ProductDto.class)).toList();
    }
}
