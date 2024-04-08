package com.anth.ecommerce.backend.module.user.infraestructure;

import com.anth.ecommerce.backend.module.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    Optional<User> findByOtp(String Token);



}
