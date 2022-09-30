package lab3.repository;

import lab3.dto.ProductDto;
import lab3.entity.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRep extends CrudRepository<ProductEntity,Integer> {

   List<ProductEntity> findAllByPriceGreaterThan(Integer minPrice);
   List<ProductEntity> findAllByPriceLessThan( Integer price);
   List<ProductEntity> findAllByNameContaining(String keyword);

@Query(value = "SELECT * FROM lab3db.product_entity inner join lab3db.category_entity ON lab3db.product_entity.id_category =lab3db.category_entity.id and lab3db.category_entity.name=:name" +
        "",nativeQuery = true)
   List<ProductEntity> findByProductsByCategory (String name);
}
