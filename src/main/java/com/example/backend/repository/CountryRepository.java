package com.example.backend.repository;

import com.example.backend.entity.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {
    // You can define custom query methods here if needed
}