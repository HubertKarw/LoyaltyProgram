package com.example.loyalty_program.mapper;


import com.example.loyalty_program.dto.CreateRewardCommand;
import com.example.loyalty_program.dto.RewardDTO;
import com.example.loyalty_program.model.Reward;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RewardMapper {
    public RewardDTO mapToDTO(Reward reward);
    public Reward mapToReward(CreateRewardCommand dto);
}

