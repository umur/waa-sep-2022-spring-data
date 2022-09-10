package com.waa.waalabthree.Repository;

import com.waa.waalabthree.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductRepository extends CrudRepository<Product,Integer> {
public List<Product> getProductsByName(String name);
public List<Product>getProductsByPrice(double price);

}
