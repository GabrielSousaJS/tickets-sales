package com.gabrielsousa.ticketssales.repositories;

import com.gabrielsousa.ticketssales.entities.OrderTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTicketRepository extends JpaRepository<OrderTicket, Long> {
}
