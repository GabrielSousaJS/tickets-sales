package com.gabrielsousa.ticketssales.config;

import com.gabrielsousa.ticketssales.entities.*;
import com.gabrielsousa.ticketssales.entities.enums.Category;
import com.gabrielsousa.ticketssales.entities.enums.OrderStatus;
import com.gabrielsousa.ticketssales.repositories.*;
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

    @Autowired
    private ShowTypeRepository showTypeRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private OrderTicketRepository orderTicketRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Bryan May", "bryan@gmail.com", "9823-9232", "123456");
        User u2 = new User(null, "Maria Brow", "maria@gmail.com", "8239-9321", "654321");
        User u3 = new User(null, "John Marrow", "john@gmail.com", "2938-9422", "983489");
        User u4 = new User(null, "Marcus Carlsen", "marcus@gmail.com", "9822-9832", "988923");
        User u5 = new User(null, "Joseph Glau", "joseph@gmail.com", "7392-6456", "356115");

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));

        Order o1 = new Order(null, Instant.parse("2021-06-12T19:53:07Z"), OrderStatus.WAINTING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2021-07-01T03:42:10Z"), OrderStatus.WAINTING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2021-07-13T15:21:22Z"), OrderStatus.SHIPPED, u3);
        Order o4 = new Order(null, Instant.parse("2021-08-23T19:53:07Z"), OrderStatus.SHIPPED, u4);
        Order o5 = new Order(null, Instant.parse("2021-08-31T03:42:10Z"), OrderStatus.DELIVERED, u5);
        Order o6 = new Order(null, Instant.parse("2021-09-30T15:21:22Z"), OrderStatus.PAID, u1);
        Order o7 = new Order(null, Instant.parse("2021-10-13T19:53:07Z"), OrderStatus.CANCELED, u2);
        Order o8 = new Order(null, Instant.parse("2021-10-24T03:42:10Z"), OrderStatus.DELIVERED, u2);
        Order o9 = new Order(null, Instant.parse("2021-11-20T15:21:22Z"), OrderStatus.PAID, u3);
        Order o10 = new Order(null, Instant.parse("2021-12-10T19:53:07Z"), OrderStatus.PAID, u4);
        Order o11 = new Order(null, Instant.parse("2021-12-19T03:42:10Z"), OrderStatus.SHIPPED, u5);
        Order o12 = new Order(null, Instant.parse("2021-12-13T15:21:22Z"), OrderStatus.CANCELED, u3);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12));

        ShowType st1 = new ShowType(null, "Theater");
        ShowType st2 = new ShowType(null, "Movie Theater");
        ShowType st3 = new ShowType(null, "Art exposition");
        ShowType st4 = new ShowType(null, "Music concert");

        showTypeRepository.saveAll(Arrays.asList(st1, st2, st3, st4));

        Ticket t1 = new Ticket(null, "Thor: Love and Thunder", 25.00, "In Marvel Studios' Thor: Love and Thunder, the God of Thunder teams up with Valkyrie, Korg and his ex-girlfriend Jane Foster-turned-Mighty Thor, to face a galactic assassin known as Gorr, the Butcher of the Gods.",  Instant.parse("2022-11-15T19:00:00Z"), Category.VIP, st2);
        Ticket t2 = new Ticket(null, "The Queen Family Singalong", 30.50, "This is real life, not just fantasy! Invite friends and family from across the country to gather in their living rooms, turn up the volume and enjoy an hour of incredible hits performed by artists the whole family knows and loves.",  Instant.parse("2022-10-23T20:30:00Z"), Category.NORMAL, st4);
        Ticket t3 = new Ticket(null, "Hamilton", 45.00, "The filmed version of the original Broadway smash hit Hamilton combines the best elements of theater, film and streaming into a stunning fusion of hip-hop, jazz R&B and Broadway. Featuring the story of America's founding father Alexander Hamilton, this revolutionary moment in theater is the story of America at the time, as told by America Today.", Instant.parse("2022-10-14T21:00:00Z"), Category.BASIC, st1);
        Ticket t4 = new Ticket(null, "Beyond Van Gogh Brazil", 25.00, "An immersive experience through the work of Van Gogh.",  Instant.parse("2022-12-13T22:30:00Z"), Category.VIP, st3);
        Ticket t5 = new Ticket(null, "Abracadabra", 30.00, "It's been 29 years since the black flame candle was lit and resurrected the 17th century sisters, and they want revenge. Now, three teenagers must stop the ravenous witches from wreaking more havoc in Salem before dawn on Halloween.",  Instant.parse("2022-10-22T23:00:00Z"), Category.BASIC, st2);
        Ticket t6 = new Ticket(null, "The Freddie Mercury Tribute", 60.00, "The show was a tribute to Queen frontman Freddie Mercury, who died of AIDS on November 24, 1991. The show marked bassist John Deacon's last full show with Queen (except for a short live appearance with Brian May, Roger Taylor and Elton John in 1997).",  Instant.parse("2022-10-30T00:00:00Z"), Category.VIP, st4);

        ticketRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));

        OrderTicket ot1 = new OrderTicket(t1, o1, 2, t1.getPrice());
        OrderTicket ot2 = new OrderTicket(t2, o1, 1, t2.getPrice());
        OrderTicket ot3 = new OrderTicket(t3, o1, 4, t3.getPrice());
        OrderTicket ot4 = new OrderTicket(t4, o1, 6, t4.getPrice());
        OrderTicket ot5 = new OrderTicket(t5, o1, 2, t5.getPrice());
        OrderTicket ot6 = new OrderTicket(t2, o1, 1, t2.getPrice());
        OrderTicket ot7 = new OrderTicket(t6, o1, 6, t6.getPrice());
        OrderTicket ot8 = new OrderTicket(t3, o1, 4, t3.getPrice());

        orderTicketRepository.saveAll(Arrays.asList(ot1, ot2, ot3, ot4, ot5, ot6, ot7, ot8));
    }
}
