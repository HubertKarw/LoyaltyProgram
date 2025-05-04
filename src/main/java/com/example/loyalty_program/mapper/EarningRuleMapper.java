package com.example.loyalty_program.mapper;

import com.example.loyalty_program.dto.EarningRuleDTO;
import com.example.loyalty_program.model.EarningRule;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EarningRuleMapper {
    EarningRuleDTO mapToDTO(EarningRule earningRule);
    EarningRule mapToRule(EarningRuleDTO dto);
}