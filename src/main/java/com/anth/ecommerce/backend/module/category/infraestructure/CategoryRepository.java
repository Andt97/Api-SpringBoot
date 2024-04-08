package com.anth.ecommerce.backend.module.category.infraestructure;

import com.anth.ecommerce.backend.module.category.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
