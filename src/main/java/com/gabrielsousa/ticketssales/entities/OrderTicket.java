package com.gabrielsousa.ticketssales.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gabrielsousa.ticketssales.entities.pk.OrderTicketPk;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "tb_order_ticket")
public class OrderTicket {

    @EmbeddedId
    private OrderTicketPk id = new OrderTicketPk();
    private Integer quantity;
    private Double price;

    public OrderTicket() {
    }

    public OrderTicket(Ticket ticket, Order order, Integer quantity, Double price) {
        id.setTicket(ticket);
        id.setOrder(order);
        this.quantity = quantity;
        this.price = price;
    }

    @JsonIgnore
    public Ticket getTicket() {
        return id.getTicket();
    }

    public void setTicket(Ticket ticket) {
        id.setTicket(ticket);
    }

    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderTicket that = (OrderTicket) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
