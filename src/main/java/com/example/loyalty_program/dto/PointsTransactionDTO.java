package com.example.loyalty_program.dto;

import com.example.loyalty_program.model.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PointsTransactionDTO {
    private TransactionType type;
    private String points;
    private String description;
    private long pointsBalance;
}

