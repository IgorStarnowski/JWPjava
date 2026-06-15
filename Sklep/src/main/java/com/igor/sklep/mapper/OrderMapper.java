package com.igor.sklep.mapper;

import com.igor.sklep.Cart;
import com.igor.sklep.CartItem;
import com.igor.sklep.dto.OrderDTO;
import com.igor.sklep.model.order.Order;
import com.igor.sklep.model.order.OrderItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderMapper {
    public static Order mapToOrder(OrderDTO orderDto) {
        return Order.builder()
                .name(orderDto.getFirstName())
                .lastName(orderDto.getLastName())
                .address(orderDto.getAddress())
                .city(orderDto.getCity())
                .postalCode(orderDto.getPostCode())
                .created(LocalDateTime.now())
                .build();
    }
    public static List<OrderItem> mapToOrderItemList(Cart cart, Order order) {
        List<OrderItem> orderItems = new ArrayList<>();
        for (CartItem ci : cart.getCartItems()) {
            orderItems.add(new OrderItem(order.getOrderId(), ci.getItem().getId(), ci.getCounter()));
        }
        return orderItems;
    }
}
