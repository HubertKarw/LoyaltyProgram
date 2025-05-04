package com.example.loyalty_program.service;

import com.example.loyalty_program.dto.CreatePointsTransactionCommand;
import com.example.loyalty_program.dto.PointsTransactionDTO;
import com.example.loyalty_program.mapper.PointsTransactionMapper;
import com.example.loyalty_program.model.PointsTransaction;
import com.example.loyalty_program.repository.PointsTransactionRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PointsTransactionService {
    private final PointsTransactionRepository repository;
    private final PointsTransactionMapper mapper;

//    public PointsTransactionDTO createTransaction(CreatePointsTransactionCommand dto){
//        PointsTransaction transaction = mapper.mapToTransaction(dto);
//        transaction.setMembership();
//        transaction.setUser();
//
//        return mapper.mapToDTO(repository.save(transaction))
//        return null;
//    }
}
