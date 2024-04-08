package com.anth.ecommerce.backend.security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@CrossOrigin

public class RegisterRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
