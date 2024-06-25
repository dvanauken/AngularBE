package com.example.backend.repository;

import com.example.backend.entity.Role;
import com.example.backend.entity.RoleUser;
import com.example.backend.entity.Segment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

import com.example.backend.entity.Role;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface RoleUserRepository extends CrudRepository<RoleUser, Long> {
    @Query("SELECT r FROM Role r INNER JOIN RoleUser ru ON r.id = ru.role.id WHERE ru.user.id = :userId")
    Collection<Role> findRolesByUserId(@Param("userId") Long userId);
}
