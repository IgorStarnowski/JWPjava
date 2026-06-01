package com.igor.sklep.controller;

import com.igor.sklep.Cart;
import com.igor.sklep.CartItem;
import com.igor.sklep.model.Item;
import com.igor.sklep.repository.ItemRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
    private final ItemRepository itemRepository;
    private final Cart cart;

    @Autowired
    public HomeController(ItemRepository itemRepository, Cart cart) {
        this.itemRepository = itemRepository;
        this.cart = cart;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("items", itemRepository.findAll());
        return "home";
    }

    @GetMapping("/add/{itemId}")
    public String addItemToCart(@PathVariable("itemId") Long itemId, Model model){
        Optional<Item> oItem = itemRepository.findById(itemId);
        if(oItem.isPresent()){
            Item item = oItem.get();
            CartItem cartItem = new CartItem(item);
            cart.addItem(cartItem);
        }
        return "redirect:/";
    }
}