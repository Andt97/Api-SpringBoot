package com.anth.ecommerce.backend.module.cart.infraestructure;

import com.anth.ecommerce.backend.module.cart.domain.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository<Cart,Integer> {

}
