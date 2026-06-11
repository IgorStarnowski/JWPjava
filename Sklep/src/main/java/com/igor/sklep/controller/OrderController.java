package com.igor.sklep.controller;

import com.igor.sklep.Cart;
import com.igor.sklep.ItemOperation;
import com.igor.sklep.service.CartService;
import jakarta.persistence.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yaml.snakeyaml.events.Event;

@Controller
@RequestMapping("/order")
public class OrderController {
    private final CartService cartService;
    public OrderController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping("/cart")
    public String showCart(){
        return "cartView";
    }

    @GetMapping("/increase/{itemId}")
    public String increaseItem(@PathVariable("itemId") Long itemId){
        cartService.itemOperation(itemId, ItemOperation.INCREASE);
        return "redirect:/order/cart";
    }
    @GetMapping("/decrease/{itemId}")
    public String decreaseItem(@PathVariable("itemId") Long itemId){
        cartService.itemOperation(itemId, ItemOperation.DECREASE);
        return "redirect:/order/cart";
    }
    @GetMapping("/remove/{itemId}")
    public String removeItemsFromCart(@PathVariable("itemId") Long itemId){
        cartService.itemOperation(itemId, ItemOperation.REMOVE);
        return "redirect:/order/cart";
    }
}
