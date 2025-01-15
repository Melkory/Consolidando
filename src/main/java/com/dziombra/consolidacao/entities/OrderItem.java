package com.dziombra.consolidacao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_orderItem")
public class OrderItem {

    private Integer quantity;
    private Double price;

    public OrderItem() {
    }

    public OrderItem( Integer quantity, Double price ) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity( Integer quantity ) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice( Double price ) {
        this.price = price;
    }
}
