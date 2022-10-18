package com.gabrielsousa.ticketssales.entities.pk;

import com.gabrielsousa.ticketssales.entities.Order;
import com.gabrielsousa.ticketssales.entities.Ticket;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderTicketPk implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderTicketPk that = (OrderTicketPk) o;
        return Objects.equals(ticket, that.ticket) && Objects.equals(order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticket, order);
    }
}
