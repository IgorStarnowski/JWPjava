package com.igor.sklep.model.order;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long orderId;
    private String name;
    private String lastName;
    private String address;
    private String postalCode;
    private String city;
    private LocalDateTime created;

    @OneToMany
    @JoinColumn(name = "orderId")
    private List<OrderItem> orderItems;
}
