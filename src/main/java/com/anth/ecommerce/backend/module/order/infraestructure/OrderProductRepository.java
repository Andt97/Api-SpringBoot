package com.anth.ecommerce.backend.module.order.infraestructure;

import com.anth.ecommerce.backend.module.order.domain.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct,Integer> {
}
