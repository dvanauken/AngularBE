package com.example.backend.service;

import com.example.backend.entity.Airport;
import com.example.backend.repository.AirportRepository;
import com.example.backend.repository.SegmentRepository;
import com.example.backend.repository.UniqueMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private UniqueMarketRepository uniqueMarketRepository;

    public List<Airport> getAllAirports() {
        return (List<Airport>) airportRepository.findAll();
    }
}