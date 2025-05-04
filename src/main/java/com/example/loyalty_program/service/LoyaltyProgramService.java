package com.example.loyalty_program.service;

import com.example.loyalty_program.dto.CreateLoyaltyProgramCommand;
import com.example.loyalty_program.dto.LoyaltyProgramDTO;
import com.example.loyalty_program.mapper.LoyaltyProgramMapper;
import com.example.loyalty_program.repository.LoyaltyProgramRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoyaltyProgramService {
    private final LoyaltyProgramMapper mapper;
    private final LoyaltyProgramRepository repository;

    public LoyaltyProgramDTO createProgram(CreateLoyaltyProgramCommand dto){
        return mapper.mapToDto(repository.save(mapper.mapToProgram(dto)));
    }
}
