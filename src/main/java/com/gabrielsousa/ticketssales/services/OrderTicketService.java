package com.gabrielsousa.ticketssales.services;

import com.gabrielsousa.ticketssales.entities.OrderTicket;
import com.gabrielsousa.ticketssales.repositories.OrderTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderTicketService {

    @Autowired
    private OrderTicketRepository repository;

    public List<OrderTicket> findAll() {
        return repository.findAll();
    }

    public OrderTicket findById(Long id) {
        Optional<OrderTicket> orderTicket = repository.findById(id);
        return orderTicket.get();
    }

}
