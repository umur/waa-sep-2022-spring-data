package edu.miu.demo.service.Impl;

import edu.miu.demo.dto.UserDto;
import edu.miu.demo.repo.UserRepo;
import edu.miu.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Type;
import java.util.List;

@AllArgsConstructor
@Service
@Transactional
public class UserServiceImpl implements UserService {
    private UserRepo userRepository;

    private ModelMapper modelMapper;

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<UserDto> findAll() {
        var users = userRepository.findAll();
        Type listType = new TypeToken<List<UserDto>>(){}.getType();
        return modelMapper.map(users,listType);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public UserDto findById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("User does not exist %s",id)));
        return modelMapper.map(userRepository.save(user),UserDto.class);
    }

    @Override
    public UserDto save(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return modelMapper.map(userRepository.save(user),UserDto.class);
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }
}
