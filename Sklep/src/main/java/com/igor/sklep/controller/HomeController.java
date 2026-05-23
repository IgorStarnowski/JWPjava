package com.igor.sklep.controller;

import com.igor.sklep.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    static List<Item> items=new ArrayList<>();
    static {
        items.add(new Item("Ołówek", new BigDecimal("1.50"), "https://vika.com.pl/media/products/18c35e8e23e330eac272f49e8871f920/images/thumbnail/big_OG.jpg?lm=1645167769"));
        items.add(new Item("Długopis", new BigDecimal("10.50"), "https://reklamydrukarnia.pl/userdata/public/gfx/13141/Dlugopis-aluminiowy-Lindi-Czarno-Zloty-z-grawerem.jpg"));
        items.add(new Item("Pióro", new BigDecimal("105.50"), "https://dlabiura24.pl/i/cms/022201.jpg"));
    }
    @GetMapping("/")
//    @ResponseBody
    public String home(Model model){
        model.addAttribute("items", items);
//        model.addAttribute("item", new Item("Ołówek",
//                new BigDecimal("1.60"), "https://dentaltree.pl/pl/p/Olowek-z-gumka/118020?srsltid=AfmBOop5bcsnqnfEMXzBznNWo8nuS2lm2d9bWKqBolitWKeiwEsircRv"));
        return "home";
    }
}