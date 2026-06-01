package com.igor.sklep;

import com.igor.sklep.model.Item;
import lombok.Getter;

import java.math.BigDecimal;
@Getter
public class CartItem {
    private Item item;
    private int counter;
    private BigDecimal price;

    public CartItem(Item item) {
        this.item = item;
        this.counter = 1;
        this.price = item.getPrice();
    }
    public void increaseCounter() {
        counter++;
        recalculatePrice();
    }
    public void decreaseCounter() {
        if (counter > 0) {
            counter--;
        }
        recalculatePrice();
    }
    public void recalculatePrice() {
        price = item.getPrice().multiply(new BigDecimal(counter));
    }
    public boolean hasZeroItems() {
        return counter == 0;
    }
    public boolean isEqualId(Item item) {
        return this.item.equals(item);
    }
}
