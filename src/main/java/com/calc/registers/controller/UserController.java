package com.calc.registers.controller;

import com.calc.registers.dto.UserDTO;
import com.calc.registers.models.User;
import com.calc.registers.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(value = "*")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public User save(@RequestBody @Valid UserDTO userDTO) {
        return this.userService.save(userDTO);
    }

    @GetMapping()
    public List<User> findAll() { return this.userService.findAll(); }

}
