package com.anth.ecommerce.backend.module.order.domain.dto;

import com.anth.ecommerce.backend.module.order.domain.Order;
import com.anth.ecommerce.backend.module.product.domain.Product;

import java.util.Date;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
