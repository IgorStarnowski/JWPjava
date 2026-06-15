package com.igor.sklep.model.order;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "orderitem")
public class OrderItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;
    private Long orderId;
    private Long itemId;
    private int amount;

    public OrderItem(Long orderId, Long itemId, int amount) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.amount = amount;
    }
}
