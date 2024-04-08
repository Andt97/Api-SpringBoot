package com.anth.ecommerce.backend.module.reviews.application.service;

import com.anth.ecommerce.backend.module.reviews.domain.Review;
import com.anth.ecommerce.backend.module.reviews.domain.dto.ReviewDTO;
import com.anth.ecommerce.backend.module.reviews.infraestructure.ReviewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewsRepository reviewsRepository;

    public List<ReviewDTO> getAllReview(){
        List<Review> reviews=reviewsRepository.findAll();
        List<ReviewDTO>reviewDTOS=new ArrayList<>();
        for (Review review:reviews){
            ReviewDTO reviewDTO=convertToDTO(review);
            reviewDTOS.add(reviewDTO);
        }
        return reviewDTOS;
    }

    private ReviewDTO convertToDTO(Review review) {
        ReviewDTO reviewDTO=new ReviewDTO();
        reviewDTO.setId(review.getId());

        return reviewDTO;
    }
}
