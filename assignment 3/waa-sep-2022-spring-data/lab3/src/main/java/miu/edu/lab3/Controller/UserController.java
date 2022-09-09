package miu.edu.lab3.Controller;

import miu.edu.lab3.DTO.UserDTO;
import miu.edu.lab3.Service.UserServiceInterface;
import miu.edu.lab3.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UserController {

    @Autowired
    UserServiceInterface userService;

    @GetMapping
    public List<UserDTO> findALl(){
        return userService.findAll();
    }

    @PutMapping("/userUpdate")
    public void update(@RequestBody UserDTO user){
      userService.update(user);
    }

    @DeleteMapping("/{Id}")
    public  UserDTO deletebyId(@PathVariable int id){
        return userService.deleteById(id);
    }

    @PostMapping("/Save")
    public void create(@RequestBody UserDTO user){
        userService.createUser(user);
    }
}
