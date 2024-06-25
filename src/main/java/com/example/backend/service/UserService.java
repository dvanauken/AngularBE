package com.example.backend.service;

import com.example.backend.entity.Segment;
import com.example.backend.entity.UniqueMarket;
import com.example.backend.entity.User;
import com.example.backend.repository.SegmentRepository;
import com.example.backend.repository.UniqueMarketRepository;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        List<User> list = new ArrayList((Collection) userRepository.findAll());
        return list;
    }

}