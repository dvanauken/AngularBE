package com.example.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "unique_markets")
public class UniqueMarket {

    @Id
    @Column(name = "orig")
    private String orig;

    @Column(name = "dest")
    private String dest;

    @Column(name = "orig_latitude")
    private Double origLatitude;

    @Column(name = "orig_longitude")
    private Double origLongitude;

    @Column(name = "dest_latitude")
    private Double destLatitude;

    @Column(name = "dest_longitude")
    private Double destLongitude;

    public UniqueMarket() {
        // Default constructor
    }

    // Getters and setters

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public Double getOrigLatitude() {
        return origLatitude;
    }

    public void setOrigLatitude(Double origLatitude) {
        this.origLatitude = origLatitude;
    }

    public Double getOrigLongitude() {
        return origLongitude;
    }

    public void setOrigLongitude(Double origLongitude) {
        this.origLongitude = origLongitude;
    }

    public Double getDestLatitude() {
        return destLatitude;
    }

    public void setDestLatitude(Double destLatitude) {
        this.destLatitude = destLatitude;
    }

    public Double getDestLongitude() {
        return destLongitude;
    }

    public void setDestLongitude(Double destLongitude) {
        this.destLongitude = destLongitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UniqueMarket that = (UniqueMarket) o;

        if (!orig.equals(that.orig)) return false;
        return dest.equals(that.dest);
    }

    @Override
    public int hashCode() {
        int result = orig.hashCode();
        result = 31 * result + dest.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UniqueMarket{" +
                "orig='" + orig + '\'' +
                ", dest='" + dest + '\'' +
                ", origLatitude=" + origLatitude +
                ", origLongitude=" + origLongitude +
                ", destLatitude=" + destLatitude +
                ", destLongitude=" + destLongitude +
                '}';
    }
// Override equals and hashCode based on orig and dest fields
    // Override toString method if needed
}
