package com.dziombra.consolidacao.dto;

import com.dziombra.consolidacao.entities.*;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class OrderDTO {

    private Long id;
    private Instant moment;
    private OrderStatus status;
    private User client;
    private PaymentDTO payment;
    private Set<OrderItemDTO> items = new HashSet<>();

    public OrderDTO( Long id, Instant moment, OrderStatus status, User client, PaymentDTO payment, Set<OrderItemDTO> items ) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.payment = payment;
        this.items = items;
    }

    public OrderDTO( Order entity ) {
        id = entity.getId();
        moment = entity.getMoment();
        status = entity.getStatus();
        client = new ClientDTO (entity.getClient());
        payment = (entity.getPayment() == null) ? null : new PaymentDTO(entity.getPayment());
        for (OrderItem item : entity.getItems()) {
            OrderItemDTO itemDTO = new OrderItemDTO(item);
            items.add(itemDTO);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment( Instant moment ) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus( OrderStatus status ) {
        this.status = status;
    }

    public User getClient() {
        return client;
    }

    public void setClient( User client ) {
        this.client = client;
    }

    public PaymentDTO getPayment() {
        return payment;
    }

    public void setPayment( PaymentDTO payment ) {
        this.payment = payment;
    }

    public Set<OrderItemDTO> getItems() {
        return items;
    }

    public void setItems( Set<OrderItemDTO> items ) {
        this.items = items;
    }

    public Double getTotal () {
        double sum = 0;
        for (OrderItemDTO item : items) {
            sum = sum + item.getSubTotal();
        }
        return sum;
    }
}
