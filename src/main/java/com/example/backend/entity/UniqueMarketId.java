package com.example.backend.entity;

import java.io.Serializable;
import java.util.Objects;

public class UniqueMarketId implements Serializable {
    private String orig;
    private String dest;

    public UniqueMarketId() {
    }

    public UniqueMarketId(String orig, String dest) {
        this.orig = orig;
        this.dest = dest;
    }

    // Getters and setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueMarketId that = (UniqueMarketId) o;
        return Objects.equals(orig, that.orig) && Objects.equals(dest, that.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orig, dest);
    }

    // Additional getters and setters
}
