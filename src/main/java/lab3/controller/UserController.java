package lab3.controller;

import lab3.dto.UserDto;
import lab3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

@Autowired
private UserService userService;

@PostMapping("/users")

    public  void saveUser(@RequestBody UserDto userDto){

    userService.saveUser(userDto);

}
@GetMapping("/users/{id}")
    public UserDto getUserById(@PathVariable int id){
  return  userService.getUserById(id);
}
}
