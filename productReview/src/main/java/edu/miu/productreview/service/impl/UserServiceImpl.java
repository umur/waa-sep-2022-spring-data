package edu.miu.productreview.service.impl;

import edu.miu.productreview.domain.User;
import edu.miu.productreview.dto.UserDto;
import edu.miu.productreview.mapper.UserMapper;
import edu.miu.productreview.repo.UserRepo;
import edu.miu.productreview.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final UserRepo userRepo;
    @Override
    public UserDto save(UserDto user) {
        User result = userRepo.save(userMapper.toEntity(user));
        return userMapper.toDto(result);
    }

    @Override
    public List<UserDto> findAll() {
        Iterable<User> result = userRepo.findAll();
        List<User> users = new ArrayList<>();
        result.forEach(users::add);
        return userMapper.toDtos(users);
    }

    @Override
    public UserDto findById(int id) {
        return userRepo.findById(id)
                .map(userMapper::toDto)
                .orElse(new UserDto());
    }

    @Override
    public UserDto update(int id, UserDto user) {
        if(userRepo.existsById(id)) {
            user.setId(id);
            return this.save(user);
        } else {
            throw new NoResultException();
        }
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }
}
