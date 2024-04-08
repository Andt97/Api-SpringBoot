package com.anth.ecommerce.backend.module.user.application.service;

import com.anth.ecommerce.backend.module.user.domain.User;
import com.anth.ecommerce.backend.module.user.domain.dto.UserDTO;
import com.anth.ecommerce.backend.module.user.infraestructure.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    //@Autowired
    private final UserRepository userRepository;

    public Page<UserDTO> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable).map(this::convertToDTO);
    }

    public void createUser(UserDTO userDTO) {
        User user = convertToEntity(userDTO);
        userRepository.save(user);
    }

    public void updateUser(Integer id, UserDTO updateUserDTO) {
        User exitingUser = userRepository.findById(id).orElseThrow();
        exitingUser.setUpdatedBy(updateUserDTO.getUpdatedBy());
        exitingUser.setUpdatedAt(updateUserDTO.getUpdatedAt());
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    private User convertToEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setPhone(userDTO.getPhone());
        user.setCreatedAt(user.getCreatedAt());
        user.setCreatedBy(user.getCreatedBy());
        return user;
    }

    private UserDTO convertToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setPhone(user.getPhone());
        userDTO.setCreatedAt(user.getCreatedAt());
        userDTO.setCreatedBy(user.getCreatedBy());

        return userDTO;
    }

}

