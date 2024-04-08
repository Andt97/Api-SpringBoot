package com.anth.ecommerce.backend.module.order.domain;

import com.anth.ecommerce.backend.module.product.domain.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orderProducts")
public class OrderProduct {
    @Id
    @GeneratedValue

    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product.id")
    private Product product;

    @Basic Integer price;
    private Date createdAt;

}
