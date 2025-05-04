package com.example.loyalty_program.repository;

import com.example.loyalty_program.model.PointsTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointsTransactionRepository extends JpaRepository<PointsTransaction, Long> {
}
