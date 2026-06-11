package com.igor.sklep.service;

import com.igor.sklep.Cart;
import com.igor.sklep.ItemOperation;
import com.igor.sklep.model.Item;
import com.igor.sklep.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    private final ItemRepository itemRepository;
    private final Cart cart;

    @Autowired
    public CartService(ItemRepository itemRepository, Cart cart) {
        this.itemRepository = itemRepository;
        this.cart = cart;
    }
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
    public void itemOperation(Long itemId, ItemOperation operation) {
        Optional<Item> oItem = itemRepository.findById(itemId);

        if (oItem.isPresent()) {
            Item item = oItem.get();

            switch (operation) {
                case INCREASE:
                    cart.addItem(item);
                    break;
                case DECREASE:
                    cart.decreaseItem(item);
                    break;
                case REMOVE:
                    cart.RemoveAllItems(item);
                    break;
            }
        }
    }
}
