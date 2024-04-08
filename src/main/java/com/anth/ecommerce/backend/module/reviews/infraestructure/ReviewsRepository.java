package com.anth.ecommerce.backend.module.reviews.infraestructure;

import com.anth.ecommerce.backend.module.reviews.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepository extends JpaRepository<Review,Integer> {
}
