package com.gabrielsousa.ticketssales.repositories;

import com.gabrielsousa.ticketssales.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
