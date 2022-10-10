package com.gabrielsousa.ticketssales.services;

import com.gabrielsousa.ticketssales.entities.Ticket;
import com.gabrielsousa.ticketssales.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository repository;

    public List<Ticket> findAll() {
        List<Ticket> list = repository.findAll();
        return list;
    }

    public Ticket findById(Long id) {
        Optional<Ticket> obj = repository.findById(id);
        return obj.get();
    }

}
