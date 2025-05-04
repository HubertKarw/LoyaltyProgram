package com.example.loyalty_program.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "APPLICATION_USER")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name cannot be empty")
    private String firstName;
    @NotBlank(message = "Name cannot be empty")
    private String lastName;
    @Email(message = "Email should be valid")
    private String email;
    @Column
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime registrationDate;
//    @ManyToMany(cascade = {CascadeType.ALL})
//    @JoinTable(
//            name = "USER_LOYALTY_PROGRAM",
//            joinColumns = {@JoinColumn(name ="APPLICATION_USER_ID")},
//            inverseJoinColumns = {@JoinColumn(name = "LOYALTY_PROGRAM_ID")}
//    )
//    private List<LoyaltyProgram> programs;
    @OneToMany(mappedBy = "user")
    private List<Membership> memberships;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<PointsTransaction> transactions;


}
