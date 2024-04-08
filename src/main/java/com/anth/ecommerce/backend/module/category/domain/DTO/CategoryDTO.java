package com.anth.ecommerce.backend.module.category.domain.DTO;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
public class CategoryDTO {
    private Long id;
    private String categoryName;
    private String status;
    private Date createdAt;
    private Integer createdBy;
    private Date updatedAt;
    private Integer updatedBy;


    public CategoryDTO() {

    }
}
