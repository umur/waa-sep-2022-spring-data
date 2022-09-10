package edu.miu.springdataday3.repo;

import edu.miu.springdataday3.dto.ProductDto;
import edu.miu.springdataday3.entitiy.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {

    List<Product> findAll();

    //Fetch only productDto
    @Query(value = "SELECT p.id as id ,p.name as name FROM Product p ")
    List<ProductDto> findDtoProducts();

    // Find all products that cost more than minPrice
    List<Product>findAllByPriceGreaterThan(double price);

    //Find all products in cat category and cost less than maxPrice
//    @Query("select p from Product p inner join Category c where p.price < :id and c.id = :id")
    @Query(value = "select * from Product p  where p.catagory_id= :id and p.price < :price ", nativeQuery = true)
    List<Product> findProductsInCategoryByPriceLessThan(
            @Param("id") Integer id,
            @Param("price") Double price
    );


    //Find all products that contain keyword in the name
    List<Product> findAllByNameContaining(String name);
}
