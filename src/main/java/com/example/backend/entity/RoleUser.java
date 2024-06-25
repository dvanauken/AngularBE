package com.example.backend.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "role_user")
@IdClass(RoleUserId.class)
public class RoleUser implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role;

    @Id
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    public RoleUser() {
        // Default constructor
    }

    // Constructor with parameters
    public RoleUser(Role role, User user) {
        this.role = role;
        this.user = user;
    }

    // Getters and Setters
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

