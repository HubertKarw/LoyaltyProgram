package com.example.loyalty_program.service;

import com.example.loyalty_program.dto.CreateUserCommand;
import com.example.loyalty_program.dto.UserDTO;
import com.example.loyalty_program.mapper.UserMapper;
import com.example.loyalty_program.model.User;
import com.example.loyalty_program.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

    public List<UserDTO> getUsers(){
        return repository.findAll().stream()
                .map(mapper::mapToDTO)
                .collect(toList());
    }

    public UserDTO registerUser(CreateUserCommand dto){
        if (repository.findByEmail(dto.getEmail()).isEmpty()) {
            return mapper.mapToDTO(repository.save(mapper.mapToUser(dto)));
        }
        throw new IllegalArgumentException("Email already taken");
    }

}
