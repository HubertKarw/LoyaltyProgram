package com.example.loyalty_program.repository;

import com.example.loyalty_program.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
