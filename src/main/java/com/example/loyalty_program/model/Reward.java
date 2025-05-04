package com.example.loyalty_program.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "REWARD")
public class Reward implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    private String description;
    @Min(1)
    private Long pointsPrice;
    private Period validityPeriod;
    private boolean active;
    @ManyToOne
    @JoinColumn(name = "LOYALTY_PROGRAM_ID")
    private LoyaltyProgram program;
}
