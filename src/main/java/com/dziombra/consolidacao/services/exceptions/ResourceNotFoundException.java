package com.dziombra.consolidacao.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException( String s ) {
        super(s);
    }
}
