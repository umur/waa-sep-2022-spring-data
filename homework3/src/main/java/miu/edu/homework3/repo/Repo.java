package miu.edu.homework3.repo;

import miu.edu.homework3.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends CrudRepository<Category, Integer> {

//      List<Category> findAllByPriceGreaterThan(int price);

}
