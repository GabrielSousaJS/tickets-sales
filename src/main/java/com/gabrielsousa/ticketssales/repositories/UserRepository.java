package com.gabrielsousa.ticketssales.repositories;

import com.gabrielsousa.ticketssales.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
