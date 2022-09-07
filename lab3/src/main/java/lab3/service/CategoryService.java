package lab3.service;


import lab3.entity.Category;

import java.util.List;

public interface CategoryService  {
    Category save(Category category);

    public void update(Category category);
    public void delete(int id);
    public List<Category> findAll();
}
