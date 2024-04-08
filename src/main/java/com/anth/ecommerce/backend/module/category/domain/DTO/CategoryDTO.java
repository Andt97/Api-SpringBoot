package com.anth.ecommerce.backend.module.category.domain.DTO;

import lombok.*;

import java.util.Date;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
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


    public CategoryDTO(Long id, String categoryName, String status, Date createdAt, Integer createdBy, Date updatedAt, Integer updatedBy) {
        this.id = id;
        this.categoryName = categoryName;
        this.status = status;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

}
