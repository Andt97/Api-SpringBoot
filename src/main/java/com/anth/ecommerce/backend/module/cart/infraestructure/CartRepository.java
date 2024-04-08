package com.anth.ecommerce.backend.module.cart.infraestructure;

import com.anth.ecommerce.backend.module.cart.domain.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart,Integer> {

}
