package com.es.core.cart;

import com.es.core.model.cart.Cart;

import java.util.Map;

public interface CartService {
    Cart getCart();
    void addPhone(Long phoneId, Long quantity);
    void update(Map<Long, Long> items);
    void remove(Long phoneId);
}