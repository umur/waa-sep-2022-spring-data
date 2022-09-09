package henry.waasep2022springdata.controller;

import henry.waasep2022springdata.dto.UserDto;
import henry.waasep2022springdata.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public void save(@RequestBody UserDto userDto) {
        userService.save(userDto);
    }

    @GetMapping
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @PutMapping("/{userId}")
    public void update(@PathVariable int userId, @RequestBody UserDto userDto) {
        userService.update(userId, userDto);
    }

    @DeleteMapping("/{userId}")
    public UserDto delete(@PathVariable int userId) {
        return userService.delete(userId);
    }
}
