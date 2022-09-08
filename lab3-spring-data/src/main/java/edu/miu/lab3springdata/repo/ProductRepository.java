package edu.miu.lab3springdata.repo;

import edu.miu.lab3springdata.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findProductsByPriceGreaterThanEqual(Double minPrice);

    List<Product> findProductsByCategory_IdAndPriceLessThanEqual(int id, Double maxPrice);
}
