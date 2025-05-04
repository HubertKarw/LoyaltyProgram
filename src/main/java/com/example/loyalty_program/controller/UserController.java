package com.example.loyalty_program.controller;

import com.example.loyalty_program.dto.CreateUserCommand;
import com.example.loyalty_program.dto.UserDTO;
import com.example.loyalty_program.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    @GetMapping()
    public List<UserDTO> getUsers(){
        return service.getUsers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO createUser(@RequestBody CreateUserCommand dto){
        return service.registerUser(dto);
    }
}
