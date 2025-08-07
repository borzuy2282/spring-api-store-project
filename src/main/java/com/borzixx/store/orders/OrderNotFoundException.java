package com.borzixx.store.orders;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException() {
        super("Order with this id does not exist.");
    }
}
