package com.example.loyalty_program.service;

import com.example.loyalty_program.dto.CreateRewardCommand;
import com.example.loyalty_program.dto.RewardDTO;
import com.example.loyalty_program.mapper.RewardMapper;
import com.example.loyalty_program.model.Reward;
import com.example.loyalty_program.repository.LoyaltyProgramRepository;
import com.example.loyalty_program.repository.RewardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RewardService {
    private final RewardRepository repository;
    private final RewardMapper mapper;
    private final LoyaltyProgramRepository programRepository;

    public RewardDTO createReward(long programId, CreateRewardCommand dto){
        Reward reward = mapper.mapToReward(dto);
        reward.setProgram(programRepository.findById(programId).orElseThrow(()->new IllegalArgumentException("no program with given id")));
        return mapper.mapToDTO(repository.save(reward));
    }
}
