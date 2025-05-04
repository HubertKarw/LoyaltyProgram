package com.example.loyalty_program.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CreateRewardCommand {
    private String name;
    private String description;
    private Long pointsPrice;
//    private Period validityPeriod;
}
