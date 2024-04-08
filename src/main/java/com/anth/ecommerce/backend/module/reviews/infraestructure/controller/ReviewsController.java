package com.anth.ecommerce.backend.module.reviews.infraestructure.controller;

import com.anth.ecommerce.backend.module.reviews.application.service.ReviewService;
import com.anth.ecommerce.backend.module.reviews.domain.dto.ReviewDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/review")
@RequiredArgsConstructor
public class ReviewsController {
    private final ReviewService reviewService;

    @GetMapping
    public List<ReviewDTO> getAllReview(){
        return  reviewService.getAllReview();
    }
}
