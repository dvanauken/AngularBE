package com.example.backend.repository;

import com.example.backend.entity.UniqueMarket;
import com.example.backend.entity.UniqueMarketId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniqueMarketRepository extends JpaRepository<UniqueMarket, UniqueMarketId> {
    // Define methods as needed
}