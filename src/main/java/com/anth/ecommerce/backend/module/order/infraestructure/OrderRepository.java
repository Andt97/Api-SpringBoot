package com.anth.ecommerce.backend.module.order.infraestructure;

import com.anth.ecommerce.backend.module.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
