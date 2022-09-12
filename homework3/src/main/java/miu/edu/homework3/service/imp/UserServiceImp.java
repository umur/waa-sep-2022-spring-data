package miu.edu.homework3.service.imp;

import miu.edu.homework3.dto.UserDTO;
import miu.edu.homework3.entity.User;
import miu.edu.homework3.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp {
    private final UserRepo userRepo;
    private ModelMapper mapper;

    @Autowired
    public UserServiceImp(UserRepo userRepo, ModelMapper mapper){
        this.userRepo = userRepo;
        this.mapper = mapper;
    }

    public void delete(UserDTO userDTO){
        User user = mapper.map(userDTO, User.class);
        userRepo.save(user);
    }


}
