package com.gabrielsousa.ticketssales.config;

import com.gabrielsousa.ticketssales.entities.User;
import com.gabrielsousa.ticketssales.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Bryan May", "bryan@gmail.com", "9823-9232", "123456");
        User u2 = new User(null, "Maria Brow", "maria@gmail.com", "8239-9321", "654321");
        User u3 = new User(null, "John Marrow", "john@gmail.com", "2938-9422", "983489");
        User u4 = new User(null, "Marcus Carlsen", "marcus@gmail.com", "9822-9832", "988923");

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
    }
}
