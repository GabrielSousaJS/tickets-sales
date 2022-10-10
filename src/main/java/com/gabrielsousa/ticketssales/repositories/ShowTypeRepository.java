package com.gabrielsousa.ticketssales.repositories;

import com.gabrielsousa.ticketssales.entities.ShowType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowTypeRepository extends JpaRepository<ShowType, Long> {
}
