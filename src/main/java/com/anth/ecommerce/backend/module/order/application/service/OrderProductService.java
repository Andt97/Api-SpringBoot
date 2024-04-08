package com.anth.ecommerce.backend.module.order.application.service;

import com.anth.ecommerce.backend.module.order.domain.OrderProduct;
import com.anth.ecommerce.backend.module.order.domain.dto.OrderProductDTO;
import com.anth.ecommerce.backend.module.order.infraestructure.OrderProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderProductService {
    private final OrderProductRepository orderProductRepository;

    public List<OrderProductDTO> getAllOrderProduct() {
        List<OrderProduct> orderProducts = orderProductRepository.findAll();
        List<OrderProductDTO> orderProductDTOS = new ArrayList<>();
        for (OrderProduct orderProduct : orderProducts) {
            OrderProductDTO orderProductDTO = converToDTO(orderProduct);
            orderProductDTOS.add(orderProductDTO);
        }
        return orderProductDTOS;
    }

    private OrderProductDTO converToDTO(OrderProduct orderProduct) {
        OrderProductDTO orderProductDTO = new OrderProductDTO();
        orderProductDTO.setId(orderProduct.getId());

        return orderProductDTO;
    }
}
