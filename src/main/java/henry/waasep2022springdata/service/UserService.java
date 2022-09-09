package henry.waasep2022springdata.service;

import henry.waasep2022springdata.dto.UserDto;

import java.util.List;

public interface UserService {
    void save(UserDto userDto);
    List<UserDto> findAll();
    void update(int userId, UserDto userDto);
    UserDto delete(int userId);
}
