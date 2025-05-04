package com.example.loyalty_program.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "MEMBERSHIP",uniqueConstraints={@UniqueConstraint(columnNames={"APPLICATION_USER_ID", "LOYALTY_PROGRAM_ID" })})
public class Membership implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "APPLICATION_USER_ID")
    private User user;
    @ManyToOne
    @JoinColumn(name = "LOYALTY_PROGRAM_ID")
    private LoyaltyProgram program;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "membership")
    private LocalDateTime joinDate;
    private long pointsBalance;
}
