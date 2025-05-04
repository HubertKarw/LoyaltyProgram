package com.example.loyalty_program.repository;

import com.example.loyalty_program.model.Reward;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RewardRepository extends JpaRepository<Reward, Long> {
}
