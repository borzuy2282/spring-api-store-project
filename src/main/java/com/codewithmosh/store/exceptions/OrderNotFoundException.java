package com.codewithmosh.store.exceptions;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException() {
        super("Order with this id does not exist.");
    }
}
