package com.anth.ecommerce.backend.module.order.infraestructure.controller;

import com.anth.ecommerce.backend.module.order.application.service.OrderProductService;
import com.anth.ecommerce.backend.module.order.domain.dto.OrderProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orderProduct")
@RequiredArgsConstructor
public class OrderProductController {
    private final OrderProductService orderProductService;

    @GetMapping
    public List<OrderProductDTO> getAllOrderProduct(){
        return orderProductService.getAllOrderProduct();
    }
}
