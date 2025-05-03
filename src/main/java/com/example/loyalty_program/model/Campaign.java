package com.example.loyalty_program.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "CAMPAIGN")
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Embedded
    private Period validityPeriod;
    private float multiplier;
    private int extraPoints;
    private EarningEventType targetEventRule;
    private LoyaltyProgram program;
}
