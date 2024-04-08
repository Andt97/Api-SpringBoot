package com.anth.ecommerce.backend.module.cart.application.service;

import com.anth.ecommerce.backend.module.cart.domain.entity.CartItem;
import com.anth.ecommerce.backend.module.cart.domain.dto.CartItemDTO;
import com.anth.ecommerce.backend.module.cart.infraestructure.CartItemsRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartItemService {
    private final CartItemsRespository cartItemsRespository;

    public List<CartItemDTO> getAllCartItem() {
        List<CartItem> cartItems = cartItemsRespository.findAll();
        List<CartItemDTO> cartItemDTOS = new ArrayList<>();
        for (CartItem cartItem : cartItems) {
            CartItemDTO cartItemDTO = convertToDTO(cartItem);
            cartItemDTOS.add(cartItemDTO);
        }
        return cartItemDTOS;
    }

    public void createCardItem(CartItemDTO cartItemDTO) {
        CartItem cartItem = convertToEntity(cartItemDTO);
        cartItemsRespository.save(cartItem);
    }
    public void updateCartItem(Integer id, CartItemDTO updateCartItemDTO) {
        CartItem existingCart = cartItemsRespository.findById(id).orElseThrow();

        existingCart.setUpdatedAt(updateCartItemDTO.getUpdatedAt());
        existingCart.setUpdatedBy(updateCartItemDTO.getUpdatedBy());
    }
    public void deleteCartItem(Integer id) {
        cartItemsRespository.deleteById(id);
    }

    private CartItem convertToEntity(CartItemDTO cartItemDTO) {
        CartItem cartItem=new CartItem();
        cartItem.setId(cartItemDTO.getId());
        cartItem.setProduct(cartItemDTO.getProduct());
        cartItem.setStatus(cartItemDTO.getStatus());
        cartItem.setCreatedAt(cartItemDTO.getCreatedAt());
        cartItem.setCreatedBy(cartItemDTO.getCreatedBy());
        return cartItem;
    }

    private CartItemDTO convertToDTO(CartItem cartItem) {
        CartItemDTO cartItemDTO = new CartItemDTO();
        cartItemDTO.setId(cartItem.getId());
        cartItemDTO.setProduct(cartItem.getProduct());
        return cartItemDTO;
    }

}
