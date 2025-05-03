package com.example.loyalty_program.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Embeddable
@Table(name = "PERIOD")
public class Period {
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public boolean isActiveNow(){
        if (endDate==null){
            return true;
        }
        return LocalDateTime.now().isAfter(startDate) && LocalDateTime.now().isBefore(endDate);
    }
}
