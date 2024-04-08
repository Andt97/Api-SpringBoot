package com.anth.ecommerce.backend.module.product.domain.dto;

import com.anth.ecommerce.backend.advice.validation.anotation.ValidName;
import com.anth.ecommerce.backend.advice.validation.anotation.ValueRequired;
import lombok.*;

import java.util.Date;

@Data

public class ProductDTO {
    private Long categoryId;
    @ValidName
    private String nameProduct;
    @ValueRequired
    private String descriptionProduct;
    private double price;
    private Integer stock;
    private String status;
    private boolean delete;
    private Date createdAt;
    private Integer createdBy;
    private Date updatedAt;
    private Integer updatedBy;
/*
    public ProductDTO(String nameProduct, String descriptionProduct, Integer price, Category category, Integer stock, String status, Date createdAt, Integer createdBy, Date updatedAt, Integer updatedBy) {
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.price = price;
        this.category=category;
        this.stock = stock;
        this.status = status;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public ProductDTO() {

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }*/
}
