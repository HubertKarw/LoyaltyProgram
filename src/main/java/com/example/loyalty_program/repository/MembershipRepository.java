package com.example.loyalty_program.repository;

import com.example.loyalty_program.model.Membership;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
}
