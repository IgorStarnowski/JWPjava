package com.igor.sklep.service;

import com.igor.sklep.Cart;
import com.igor.sklep.dto.OrderDTO;
import com.igor.sklep.mapper.OrderMapper;
import com.igor.sklep.model.order.Order;
import com.igor.sklep.repository.order.OrderItemRepository;
import com.igor.sklep.repository.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;
    private final Cart cart;

    @Autowired
    public OrderService(OrderRepository orderRepository, OrderItemRepository orderItemRepository, Cart cart) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
        this.cart = cart;
    }
    public void saveOrder(OrderDTO orderDTO) {
        Order order = OrderMapper.mapToOrder(orderDTO);
        orderRepository.save(order);
        orderItemRepository.saveAll(OrderMapper.mapToOrderItemList(cart, order));
        cart.cleanCart();
    }
}
