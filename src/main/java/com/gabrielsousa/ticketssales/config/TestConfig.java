package com.gabrielsousa.ticketssales.config;

import com.gabrielsousa.ticketssales.entities.Order;
import com.gabrielsousa.ticketssales.entities.User;
import com.gabrielsousa.ticketssales.repositories.OrderRepository;
import com.gabrielsousa.ticketssales.repositories.UserRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Bryan May", "bryan@gmail.com", "9823-9232", "123456");
        User u2 = new User(null, "Maria Brow", "maria@gmail.com", "8239-9321", "654321");
        User u3 = new User(null, "John Marrow", "john@gmail.com", "2938-9422", "983489");
        User u4 = new User(null, "Marcus Carlsen", "marcus@gmail.com", "9822-9832", "988923");
        User u5 = new User(null, "Joseph Glau", "joseph@gmail.com", "7392-6456", "356115");

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));

        Order o1 = new Order(null, Instant.parse("2021-06-12T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2021-07-01T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2021-07-13T15:21:22Z"), u3);
        Order o4 = new Order(null, Instant.parse("2021-08-23T19:53:07Z"), u4);
        Order o5 = new Order(null, Instant.parse("2021-08-31T03:42:10Z"), u5);
        Order o6 = new Order(null, Instant.parse("2021-09-30T15:21:22Z"), u1);
        Order o7 = new Order(null, Instant.parse("2021-10-13T19:53:07Z"), u2);
        Order o8 = new Order(null, Instant.parse("2021-10-24T03:42:10Z"), u2);
        Order o9 = new Order(null, Instant.parse("2021-11-20T15:21:22Z"), u3);
        Order o10 = new Order(null, Instant.parse("2021-12-10T19:53:07Z"), u4);
        Order o11 = new Order(null, Instant.parse("2021-12-19T03:42:10Z"), u5);
        Order o12 = new Order(null, Instant.parse("2021-12-13T15:21:22Z"), u3);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12));


    }
}
