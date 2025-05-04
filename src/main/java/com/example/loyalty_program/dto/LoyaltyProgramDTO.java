package com.example.loyalty_program.dto;

import com.example.loyalty_program.model.Period;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LoyaltyProgramDTO {
    private String name;
    private String description;
    private Period validityPeriod;
}
