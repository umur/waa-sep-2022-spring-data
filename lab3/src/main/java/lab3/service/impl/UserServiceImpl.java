package lab3.service.impl;

import lab3.entity.User;
import lab3.repo.UserRepo;
import lab3.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepo userRepo;

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return  userRepo.findAll();
    }
}
