package com.example.loyalty_program.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class UserDTO {
    private String firstName;
    private String lastName;
    private String email;
}
