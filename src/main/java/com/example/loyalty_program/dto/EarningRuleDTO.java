package com.example.loyalty_program.dto;

import com.example.loyalty_program.model.EarningEventType;
import com.example.loyalty_program.model.Period;

public class EarningRuleDTO {
    private String name;
    private EarningEventType eventType;
    private Long points;
    private boolean active;
}
