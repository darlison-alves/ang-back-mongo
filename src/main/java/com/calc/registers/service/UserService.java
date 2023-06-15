package com.calc.registers.service;

import com.calc.registers.dto.UserDTO;
import com.calc.registers.models.User;
import com.calc.registers.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(UserDTO userDTO) {
        User user = User.builder()
                .email(userDTO.getEmail())
                .phone(userDTO.getPhone())
                .name(userDTO.getName())
                .build();
        return this.userRepository.save(user);
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }
}
