package com.dziombra.consolidacao.entities;

import jakarta.persistence.Entity;

import java.time.Instant;

@Entity
public class Payment {

    private Long id;
    private Instant moment;

    public Payment() {
    }

    public Payment( Long id, Instant moment ) {
        this.id = id;
        this.moment = moment;
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
}
