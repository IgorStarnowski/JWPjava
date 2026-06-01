package com.igor.sklep;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
public class Cart {
    private List<CartItem> cartItems = new ArrayList<>();
    private int counter = 0;
    private BigDecimal sum = BigDecimal.ZERO;

    public void addItem(CartItem item) {
        boolean itemExists = false;
        for (CartItem existingItem : cartItems) {
            if(existingItem.getItem().getId().equals(item.getItem().getId())){
                existingItem.increaseCounter();
                itemExists = true;
                break;
            }
        }
        if(!itemExists){
            cartItems.add(item);
        }
        recalculatePriceAndCounter();
    }

    public void removeItem(CartItem item) {
        CartItem itemInCart = null;
        for (CartItem existingItem : cartItems) {
            if(existingItem.getItem().getId().equals(item.getItem().getId())){
                itemInCart = existingItem;
                break;
            }
        }
        if(itemInCart != null){
            itemInCart.decreaseCounter();
            if(itemInCart.hasZeroItems()){
                cartItems.remove(itemInCart);
            }
        }
        recalculatePriceAndCounter();
    }

    private void recalculatePriceAndCounter(){
        int counter = 0;
        BigDecimal sum = BigDecimal.ZERO;
        for (CartItem item : cartItems) {
            counter += item.getCounter();
            sum = sum.add(item.getPrice());
        }
        this.counter = counter;
        this.sum = sum;
    }

}
