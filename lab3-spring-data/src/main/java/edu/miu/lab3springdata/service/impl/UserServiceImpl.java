package edu.miu.lab3springdata.service.impl;

import edu.miu.lab3springdata.dto.UserDto;
import edu.miu.lab3springdata.entity.User;
import edu.miu.lab3springdata.mapper.UserMapper;
import edu.miu.lab3springdata.repo.UserRepository;
import edu.miu.lab3springdata.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public List<UserDto> getUsers() {
        return userMapper.toDtos((List<User>) userRepository.findAll());
    }

    @Override
    @Transactional
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void add(UserDto userDto) {
        userRepository.save(userMapper.toEntity(userDto));
    }
}
