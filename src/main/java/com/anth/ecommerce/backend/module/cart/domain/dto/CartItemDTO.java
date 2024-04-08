package com.anth.ecommerce.backend.module.cart.domain.dto;
import com.anth.ecommerce.backend.module.product.domain.Product;
import lombok.Data;

import java.util.Date;

@Data
public class CartItemDTO {
    private  Integer id;
    private Product product;

    private Boolean status;
    private Date createdAt;
    private Integer createdBy;
    private Date updatedAt;
    private Integer updatedBy;


}
