package com.anth.ecommerce.backend.module.cart.infraestructure;

import com.anth.ecommerce.backend.module.cart.domain.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemsRespository extends JpaRepository<CartItem,Integer> {
}
