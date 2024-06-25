package com.example.backend.repository;

import com.example.backend.entity.Airport;
import com.example.backend.entity.Country;
import org.springframework.data.repository.CrudRepository;

public interface AirportRepository extends CrudRepository<Airport, Long> {
    // You can define custom query methods here if needed
}