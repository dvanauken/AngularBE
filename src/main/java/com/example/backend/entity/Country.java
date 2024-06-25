package com.example.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    private Long id;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "iso_codes")
    private String isoCodes;

    @Column(name = "code_3")
    private String code3;

    @Column(name = "code_2")
    private String code2;

    @Column(name = "code_3a")
    private String code3a;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", isoCodes='" + isoCodes + '\'' +
                ", code3='" + code3 + '\'' +
                ", code2='" + code2 + '\'' +
                ", code3a='" + code3a + '\'' +
                '}';
    }
}