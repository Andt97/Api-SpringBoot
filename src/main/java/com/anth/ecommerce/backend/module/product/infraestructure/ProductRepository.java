package com.anth.ecommerce.backend.module.product.infraestructure;

import com.anth.ecommerce.backend.module.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
