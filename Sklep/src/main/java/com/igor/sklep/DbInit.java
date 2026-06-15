package com.igor.sklep;

import com.igor.sklep.model.Item;
import com.igor.sklep.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;



@Configuration
public class DbInit implements CommandLineRunner {
    private final ItemRepository itemRepository;
    @Autowired
    public DbInit(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }
    @Override
    public void run(String... args) throws Exception{
        if (itemRepository.count() == 0) {
        itemRepository.saveAll(List.of(new Item("Ołówek", new BigDecimal("1.50"), "https://vika.com.pl/media/products/18c35e8e23e330eac272f49e8871f920/images/thumbnail/big_OG.jpg?lm=1645167769"),
        new Item("Długopis", new BigDecimal("10.50"), "https://reklamydrukarnia.pl/userdata/public/gfx/13141/Dlugopis-aluminiowy-Lindi-Czarno-Zloty-z-grawerem.jpg"),
        new Item("Pióro", new BigDecimal("105.50"), "https://dlabiura24.pl/i/cms/022201.jpg")));
        }
    }
}
