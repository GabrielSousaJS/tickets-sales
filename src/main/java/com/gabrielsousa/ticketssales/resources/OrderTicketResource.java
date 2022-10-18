package com.gabrielsousa.ticketssales.resources;

import com.gabrielsousa.ticketssales.entities.OrderTicket;
import com.gabrielsousa.ticketssales.services.OrderTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "orderticket")
public class OrderTicketResource {

    @Autowired
    private OrderTicketService service;

    @GetMapping
    public ResponseEntity<List<OrderTicket>> findAll() {
        List<OrderTicket> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderTicket> findById(@PathVariable Long id) {
        OrderTicket obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
