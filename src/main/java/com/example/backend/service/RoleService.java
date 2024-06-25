package com.example.backend.service;

import com.example.backend.entity.Role;
import com.example.backend.entity.Segment;
import com.example.backend.entity.UniqueMarket;
import com.example.backend.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getRoles() {
        return (List<Role>) roleRepository.findAll();
    }


}