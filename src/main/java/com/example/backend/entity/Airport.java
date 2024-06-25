package com.example.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "airports")
public class Airport {
    @Id
    @Column(name = "airport_code")
    private String airportCode;

    @Column(name = "country_code")
    private String countryCode;

    private String city;

    @Column(name = "airport_name")
    private String airportName;

    private String state;

    @Column(name = "time_zone_offset")
    private Double timeZoneOffset;

    private Double latitude;

    private Double longitude;

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getTimeZoneOffset() {
        return timeZoneOffset;
    }

    public void setTimeZoneOffset(Double timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        return airportCode.equals(airport.airportCode);
    }

    @Override
    public int hashCode() {
        return airportCode.hashCode();
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportCode='" + airportCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", city='" + city + '\'' +
                ", airportName='" + airportName + '\'' +
                ", state='" + state + '\'' +
                ", timeZoneOffset=" + timeZoneOffset +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}