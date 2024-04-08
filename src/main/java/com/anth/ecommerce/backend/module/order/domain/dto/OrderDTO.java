package com.anth.ecommerce.backend.module.order.domain.dto;

//import com.anth.ecommerce.backend.module.user.domain.User;


import com.anth.ecommerce.backend.module.user.domain.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
    private Integer id;
    private User user;

    public OrderDTO() {

    }

    public OrderDTO(Integer id, User user) {
        this.id = id;
        this.user = user;
    }


}
