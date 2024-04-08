package com.anth.ecommerce.backend.module.cart.infraestructure.controller;

import com.anth.ecommerce.backend.module.cart.application.service.CartItemService;
import com.anth.ecommerce.backend.module.cart.domain.dto.CartDTO;
import com.anth.ecommerce.backend.module.cart.domain.dto.CartItemDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cartitem")
@RequiredArgsConstructor
public class CartItemsController {
    private  final CartItemService cartItemService;

    @GetMapping
    public List<CartItemDTO>getAllCartItem(){
        return cartItemService.getAllCartItem();
    }
    @PostMapping
    public void  createCartItem(@RequestBody CartItemDTO cartItemDTO){
        cartItemService.createCardItem(cartItemDTO);
    }
    @PutMapping("/{id}")
    public void updateCartItem(@PathVariable Integer id, @RequestBody CartItemDTO updateCartItemDTO){
        cartItemService.updateCartItem(id, updateCartItemDTO);
    }
    @DeleteMapping("/{id}")
    public void  deleteCartItem(@PathVariable Integer id){
        cartItemService.deleteCartItem(id);
    }
}
