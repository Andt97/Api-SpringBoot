package com.anth.ecommerce.backend.module.user.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    private Integer id;
    private String email;
    private String password;
    private String phone;
    private Date createdAt;
    private Integer createdBy;
    private Date updatedAt;
    private Integer updatedBy;




}
