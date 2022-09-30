package lab3.service;

import lab3.dto.UserDto;
import org.springframework.stereotype.Service;


public interface UserService {
    void saveUser(UserDto userDto);

    UserDto getUserById(int id);
}
