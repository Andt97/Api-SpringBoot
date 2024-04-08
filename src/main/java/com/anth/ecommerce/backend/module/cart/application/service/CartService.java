package com.anth.ecommerce.backend.module.cart.application.service;

import com.anth.ecommerce.backend.module.cart.domain.entity.Cart;
import com.anth.ecommerce.backend.module.cart.domain.dto.CartDTO;
import com.anth.ecommerce.backend.module.cart.infraestructure.CartRepository;
import com.anth.ecommerce.backend.module.category.domain.DTO.CategoryDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;


    public Page<CartDTO> getAllCart(Pageable pageable) {
        return cartRepository.findAll(pageable)
                .map(this::convertToDTO);

    }



    private CartDTO convertToDTO(Cart cart) {
        CartDTO cartDTO = new CartDTO();
        cartDTO.setId(cart.getId());
        return cartDTO;
    }

}
