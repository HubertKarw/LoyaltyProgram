package com.example.loyalty_program.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "EARNING_RULE")
public class EarningRule implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private EarningEventType eventType;
        @Min(1)
        private Long points;
        private Period validityPeriod;
        private boolean active;
        @ManyToOne
        @JoinColumn(name = "LOYALTY_PROGRAM_ID")
        @NotNull
        private LoyaltyProgram program;

}
