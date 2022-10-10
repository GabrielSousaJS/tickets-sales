package com.gabrielsousa.ticketssales.services;

import com.gabrielsousa.ticketssales.entities.ShowType;
import com.gabrielsousa.ticketssales.repositories.ShowTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowTypeService {

    @Autowired
    private ShowTypeRepository repository;

    public List<ShowType> findAll() {
        List<ShowType> list = repository.findAll();
        return list;
    }

    public ShowType findById(Long id) {
        Optional<ShowType> obj = repository.findById(id);
        return obj.get();
    }
}
