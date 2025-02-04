package com.dziombra.consolidacao.dto;

import com.dziombra.consolidacao.entities.OrderItem;
import com.dziombra.consolidacao.entities.OrderItemPk;

public class OrderItemDTO {

    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;
    private String imgUrl;

    public OrderItemDTO( Long productId, String name, Double price, Integer quantity, String imgUrl ) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.imgUrl = imgUrl;
    }

    public OrderItemDTO( OrderItem entity ) {
        productId = entity.getOrder().getId();
        name = entity.getProduct().getName();
        price = entity.getPrice();
        quantity = entity.getQuantity();
        imgUrl = entity.getProduct().getImgUrl();
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId( Long productId ) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice( Double price ) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity( Integer quantity ) {
        this.quantity = quantity;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl( String imgUrl ) {
        this.imgUrl = imgUrl;
    }

    public double getSubTotal() {
        return price * quantity;
    }
}
