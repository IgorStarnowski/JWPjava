package com.igor.sklep.model.order;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String name;
    private String lastName;
    private String address;
    private String postalCode;
    private String city;
    private LocalDateTime created;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "orderId")
    private List<OrderItem> orderItems;
}
