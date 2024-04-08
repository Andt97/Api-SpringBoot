package com.anth.ecommerce.backend.module.user.infraestructure.controller;

import com.anth.ecommerce.backend.module.user.application.service.UserService;
import com.anth.ecommerce.backend.module.user.domain.dto.UserDTO;
import com.anth.ecommerce.backend.security.jwt.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {
    private final UserService userService;
    private final JwtService jwtService;

    @GetMapping
    public Page<UserDTO> getAllUser(@RequestParam(defaultValue = "0") int page,
                                    @RequestParam(defaultValue = "10") int size){
        Pageable pageable= PageRequest.of(page,size);
        return userService.getAllUsers(pageable);
    }

    @PostMapping
    public void createUser(@RequestBody UserDTO userDTO){
        userService.createUser(userDTO);
    }
    @PutMapping("/{id}")
    public void updateUser(@PathVariable Integer id, @RequestBody UserDTO updateUserDTO){
        userService.updateUser(id,updateUserDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id ){
        userService.deleteUser(id);
    }

    private String extractTokenFromAuthentication(Authentication authentication) {
        String token = null;
        if (authentication != null && authentication.getDetails() instanceof String) {
            token = (String) authentication.getDetails();
        }
        return token;
    }
}
