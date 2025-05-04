package com.example.loyalty_program.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class UserDTO {
    private String firstName;
    private String lastName;
    private String email;
}
