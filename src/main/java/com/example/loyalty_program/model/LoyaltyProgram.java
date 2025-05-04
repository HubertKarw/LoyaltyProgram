package com.example.loyalty_program.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "LOYALTY_PROGRAM")
public class LoyaltyProgram implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name of the program cannot be empty")
    @Column(unique=true)
    private String name;
    private String description;
    @Embedded
    private Period validityPeriod;
    @OneToMany(mappedBy = "program")
    private List<Membership> members;
    @OneToMany(mappedBy = "program", cascade = CascadeType.ALL)
    private List<EarningRule> earningRules;
    @OneToMany(mappedBy = "program",cascade = CascadeType.ALL)
    private List<Reward> rewards;
    @OneToMany(mappedBy = "program")
    private List<Campaign> campaigns;

}
