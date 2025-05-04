package com.example.loyalty_program.dto;

import com.example.loyalty_program.model.Period;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class RewardDTO {
    private String name;
    private String description;
    private Long pointsPrice;
    private boolean active;
}
