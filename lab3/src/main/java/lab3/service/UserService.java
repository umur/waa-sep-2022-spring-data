package lab3.service;

import lab3.entity.User;

import java.util.List;

public interface UserService {

    User save(User user);

    public void update(User user);
    public void delete(int id);
    public List<User> findAll();
}
