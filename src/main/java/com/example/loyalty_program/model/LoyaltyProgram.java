package com.example.loyalty_program.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "LOYALTY_PROGRAM")
public class LoyaltyProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name of the program cannot be empty")
    private String name;
    private String description;
    @Embedded
    private Period validityPeriod;
}
