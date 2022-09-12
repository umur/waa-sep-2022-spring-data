package miu.edu.homework3.repo;

import miu.edu.homework3.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo  extends CrudRepository<Product, Integer> {

    List<Product> findAll();

}
