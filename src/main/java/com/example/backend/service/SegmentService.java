package com.example.backend.service;

import com.example.backend.entity.Segment;
import com.example.backend.entity.UniqueMarket;
import com.example.backend.repository.SegmentRepository;
import com.example.backend.repository.UniqueMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SegmentService {

    @Autowired
    private SegmentRepository segmentRepository;

    @Autowired
    private UniqueMarketRepository uniqueMarketRepository;

    public List<Segment> getAllSegments() {
        return (List<Segment>) segmentRepository.findAll();
    }

    public List<UniqueMarket> findUniqueMarkets() {

        return uniqueMarketRepository.findAll();
    }

}