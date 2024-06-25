package com.example.backend.repository;

import com.example.backend.entity.Country;
import com.example.backend.entity.Segment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SegmentRepository extends CrudRepository<Segment, Long> {
}
