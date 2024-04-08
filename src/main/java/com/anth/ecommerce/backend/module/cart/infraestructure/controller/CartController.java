package com.anth.ecommerce.backend.module.cart.infraestructure.controller;

import com.anth.ecommerce.backend.module.cart.application.service.CartService;
import com.anth.ecommerce.backend.module.cart.domain.dto.CartDTO;
import com.anth.ecommerce.backend.module.cart.domain.entity.Cart;
import com.anth.ecommerce.backend.module.category.domain.DTO.CategoryDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @GetMapping
    public Page<CartDTO> getAllCart(@RequestParam(defaultValue = "0") int page,
                                            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return cartService.getAllCart(pageable);
    }

}