package com.anth.ecommerce.backend.module.order.domain.dto;

import com.anth.ecommerce.backend.module.order.domain.Order;
import com.anth.ecommerce.backend.module.product.domain.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class OrderProductDTO {

    private Integer id;
    private Order order;
    private Product product;

    private Integer price;
    private Date createdAt;

    public OrderProductDTO() {

    }

    public OrderProductDTO(Integer id, Order order, Product product, Integer price, Date createdAt) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.price = price;
        this.createdAt = createdAt;
    }

}
