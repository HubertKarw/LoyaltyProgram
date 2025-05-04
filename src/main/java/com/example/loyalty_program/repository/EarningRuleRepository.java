package com.example.loyalty_program.repository;

import com.example.loyalty_program.model.EarningRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EarningRuleRepository extends JpaRepository<EarningRule, Long> {
}
