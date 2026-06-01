package com.igor.sklep;

import com.igor.sklep.model.Item;
import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
public class Cart {
    private List<CartItem> cartItems = new ArrayList<>();
    private int counter = 0;
    private BigDecimal sum = BigDecimal.ZERO;

    private Optional<CartItem> getCartItemByItem(Item item){
        return cartItems.stream().filter(hasSameItemId(item)).findFirst();
    }

    private Predicate<CartItem> hasSameItemId(Item item){
        return existingItem -> existingItem.isEqualId(item);
    }

    public void addItem(Item item) {
        getCartItemByItem(item).ifPresentOrElse(
                cartItem -> {
                    cartItem.increaseCounter();
                },
                () -> cartItems.add(new CartItem(item))
        );
        recalculatePriceAndCounter();
    }

    public void removeItem(Item item) {
        Optional<CartItem> existingItem = getCartItemByItem(item);
        if(existingItem.isPresent()){
            existingItem.get().decreaseCounter();
            if(existingItem.get().getCounter() == 0){
                cartItems.remove(existingItem.get());
            }
        }
        recalculatePriceAndCounter();
    }

    private void recalculatePriceAndCounter() {
        this.sum = cartItems.stream().map(CartItem::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
        this.counter = cartItems.stream().map(CartItem::getCounter).reduce(0, Integer::sum);
    }

}
