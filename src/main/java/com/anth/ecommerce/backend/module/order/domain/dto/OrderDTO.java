package com.anth.ecommerce.backend.module.order.domain.dto;

//import com.anth.ecommerce.backend.module.user.domain.User;


import com.anth.ecommerce.backend.module.user.domain.User;

public class OrderDTO {
    private Integer id;
    private User user;

    public OrderDTO() {

    }

    public OrderDTO(Integer id, User user) {
        this.id = id;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
