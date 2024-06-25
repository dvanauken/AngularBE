package com.example.backend.service;

import com.example.backend.entity.Country;
import com.example.backend.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries() {
        Collection collection = (Collection) countryRepository.findAll();
        ArrayList list = new ArrayList(collection);
        return list;
    }
}