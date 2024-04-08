package com.anth.ecommerce.backend.module.order.infraestructure.controller;

import com.anth.ecommerce.backend.module.order.application.service.OrderService;
import com.anth.ecommerce.backend.module.order.domain.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private  final OrderService orderService;

    @GetMapping
    public List<OrderDTO> getAllOrder(){
        return orderService.getAllOrder();
    }
}
