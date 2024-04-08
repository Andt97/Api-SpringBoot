package com.anth.ecommerce.backend.module.order.application.service;

import com.anth.ecommerce.backend.module.order.domain.Order;
import com.anth.ecommerce.backend.module.order.domain.dto.OrderDTO;
import com.anth.ecommerce.backend.module.order.infraestructure.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<OrderDTO> getAllOrder() {
        List<Order> orders = orderRepository.findAll();
        List<OrderDTO> orderDTOS = new ArrayList<>();
        for (Order order : orders) {
            OrderDTO orderDTO = convertToDTO(order);
            orderDTOS.add(orderDTO);

        }
        return orderDTOS;
    }

    private OrderDTO convertToDTO(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(order.getId());

        return orderDTO;
    }
}
