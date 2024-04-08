package com.anth.ecommerce.backend.module.reviews.domain.dto;

import com.anth.ecommerce.backend.module.product.domain.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class ReviewDTO {

    private Integer id;
    private Product product;
    private Integer rating;
    private String comment;
    private Date createdAt;
    private Integer createdBy;
    private Date updatedAt;
    private Integer updatedBy;

    public ReviewDTO() {

    }

    public ReviewDTO(Integer id, Product product, Integer rating, String comment, Date createdAt, Integer createdBy, Date updatedAt, Integer updatedBy) {
        this.id = id;
        this.product = product;
        this.rating = rating;
        this.comment = comment;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

}
