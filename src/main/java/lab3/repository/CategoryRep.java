package lab3.repository;

import lab3.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRep extends CrudRepository<CategoryEntity,Integer> {
}
