package com.anth.ecommerce.backend.module.product.domain;


import com.anth.ecommerce.backend.module.category.domain.Category;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.*;


import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    @Id

    @GeneratedValue

    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @Basic

    private String nameProduct;
    private String descriptionProduct;
    @NotNull
    @DecimalMin(value = "0.1")
    private Double price;
    private Integer stock;
    private String status;
    @Column(name = "is_deleted")
    private boolean delete;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Integer createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Integer updatedBy;


}
