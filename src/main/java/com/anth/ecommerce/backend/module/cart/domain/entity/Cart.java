package com.anth.ecommerce.backend.module.cart.domain.entity;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue
    private Integer id;


}
