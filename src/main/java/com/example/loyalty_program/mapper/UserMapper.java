package com.example.loyalty_program.mapper;

import com.example.loyalty_program.dto.UserDTO;
import com.example.loyalty_program.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    public UserDTO mapToDTO(User user);
    public User mapToUser(UserDTO dto);
}
