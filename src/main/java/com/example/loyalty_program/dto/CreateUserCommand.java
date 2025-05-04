package com.example.loyalty_program.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CreateUserCommand {
    private String firstName;
    private String lastName;
    private String email;
}
