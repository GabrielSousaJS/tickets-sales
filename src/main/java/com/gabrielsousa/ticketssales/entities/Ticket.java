package com.gabrielsousa.ticketssales.entities;

import com.gabrielsousa.ticketssales.entities.enums.Category;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_ticket")
public class Ticket implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    @Column(length = 500)
    private String description;
    private Instant showDate;

    @ManyToOne
    @JoinColumn(name = "showType")
    private ShowType showType;
    private Integer ticketCategory;

    public Ticket() {
    }

    public Ticket(Long id, String name, Double price, String description, Instant showDate, Category ticketCategory, ShowType showType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.showDate = showDate;
        setCategory(ticketCategory);
        this.showType = showType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getShowDate() {
        return showDate;
    }

    public void setShowDate(Instant showDate) {
        this.showDate = showDate;
    }

    public ShowType getShowType() {
        return showType;
    }

    public void setShowType(ShowType showType) {
        this.showType = showType;
    }

    public Category ticketCategory() {
        return Category.valueOf(ticketCategory);
    }

    public void setCategory(Category category) {
        if (category != null) {
            this.ticketCategory = category.getCode();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(id, ticket.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}