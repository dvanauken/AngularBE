package com.example.backend.repository;

import com.example.backend.entity.Role;
import com.example.backend.entity.RoleUser;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
