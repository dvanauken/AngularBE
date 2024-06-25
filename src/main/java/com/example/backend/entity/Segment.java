package com.example.backend.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "AIRLINE_SCHEDULE")
public class Segment {
    @Id
    @Column(name = "flight_number")
    private String flightNumber;

    private String origin;

    private String destination;

    private String frequency;

    private String days;

    @Column(name = "departure_time")
    private String departureTime;

    @Column(name = "arrival_time")
    private String arrivalTime;

    @Column(name = "effective_date")
    private Date effectiveDate;

    @Column(name = "discontinued_date")
    private Date discontinuedDate;

    @Column(name = "suspension_start")
    private Date suspensionStart;

    @Column(name = "suspension_end")
    private Date suspensionEnd;

    private String notes;

    public Segment() {
        // Default constructor
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getDiscontinuedDate() {
        return discontinuedDate;
    }

    public void setDiscontinuedDate(Date discontinuedDate) {
        this.discontinuedDate = discontinuedDate;
    }

    public Date getSuspensionStart() {
        return suspensionStart;
    }

    public void setSuspensionStart(Date suspensionStart) {
        this.suspensionStart = suspensionStart;
    }

    public Date getSuspensionEnd() {
        return suspensionEnd;
    }

    public void setSuspensionEnd(Date suspensionEnd) {
        this.suspensionEnd = suspensionEnd;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Segment segment = (Segment) o;

        if (!flightNumber.equals(segment.flightNumber)) return false;
        if (!origin.equals(segment.origin)) return false;
        return destination.equals(segment.destination);
    }

    @Override
    public int hashCode() {
        int result = flightNumber.hashCode();
        result = 31 * result + origin.hashCode();
        result = 31 * result + destination.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "flightNumber='" + flightNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", frequency='" + frequency + '\'' +
                ", days='" + days + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", effectiveDate=" + effectiveDate +
                ", discontinuedDate=" + discontinuedDate +
                ", suspensionStart=" + suspensionStart +
                ", suspensionEnd=" + suspensionEnd +
                ", notes='" + notes + '\'' +
                '}';
    }

    // Getters and setters
}