package com.gabrielsousa.ticketssales.repositories;

import com.gabrielsousa.ticketssales.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
