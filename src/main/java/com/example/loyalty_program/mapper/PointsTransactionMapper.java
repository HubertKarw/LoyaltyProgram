package com.example.loyalty_program.mapper;

import com.example.loyalty_program.dto.PointsTransactionDTO;
import com.example.loyalty_program.model.PointsTransaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PointsTransactionMapper {
    PointsTransactionDTO mapToDTO(PointsTransaction pointsTransaction);
    PointsTransaction mapToTransaction(PointsTransactionDTO dto);
}
