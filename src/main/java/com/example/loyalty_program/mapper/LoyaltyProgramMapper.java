package com.example.loyalty_program.mapper;

import com.example.loyalty_program.dto.CreateLoyaltyProgramCommand;
import com.example.loyalty_program.dto.LoyaltyProgramDTO;
import com.example.loyalty_program.model.LoyaltyProgram;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoyaltyProgramMapper {
    LoyaltyProgramDTO mapToDto(LoyaltyProgram program);
    LoyaltyProgram mapToProgram(CreateLoyaltyProgramCommand dto);
}
