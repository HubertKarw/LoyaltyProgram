package com.example.loyalty_program.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "CAMPAIGN")
public class Campaign implements Serializable {
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
    @ManyToOne
    @JoinColumn(name = "LOYALTY_PROGRAM_ID")
    private LoyaltyProgram program;
}
