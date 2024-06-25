package com.example.backend.entity;

import java.io.Serializable;
import java.util.Objects;

public class RoleUserId implements Serializable {
    private Role role;
    private User user;

    public RoleUserId() {
        // Default constructor
    }

    public RoleUserId(Role role, User user) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleUserId that = (RoleUserId) o;
        return Objects.equals(role, that.role) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, user);
    }
}
