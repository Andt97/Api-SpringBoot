package com.anth.ecommerce.backend.module.cart.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
    private String infoMessage;

    public Message(String infoMessage) {
        this.infoMessage = infoMessage;
    }
    public Message(){

    }


}
