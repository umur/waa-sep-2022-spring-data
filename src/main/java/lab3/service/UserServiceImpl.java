package lab3.service;

import lab3.dto.UserDto;
import lab3.entity.UserEntity;
import lab3.repository.UserRep;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserRep userRep;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void saveUser(UserDto userDto) {
        UserEntity userEntity =mapper.map(userDto,UserEntity.class);
        userRep.save(userEntity);
    }

    @Override
    public UserDto getUserById(int id) {
        UserEntity user =userRep.findById(id).get();
        UserDto userDto= mapper.map(user,UserDto.class);
        return userDto;
    }
}
