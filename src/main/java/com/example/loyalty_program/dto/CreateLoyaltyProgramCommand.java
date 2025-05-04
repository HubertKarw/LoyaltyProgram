package com.example.loyalty_program.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CreateLoyaltyProgramCommand {
    private String name;
    private String description;
//    private Period validityPeriod;
}
