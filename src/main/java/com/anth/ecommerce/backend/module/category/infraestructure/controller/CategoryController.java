package com.anth.ecommerce.backend.module.category.infraestructure.controller;

import com.anth.ecommerce.backend.module.category.application.service.CategoryService;
import com.anth.ecommerce.backend.module.category.domain.DTO.CategoryDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
@RequiredArgsConstructor
@CrossOrigin
public class CategoryController {
    @Autowired
    private final CategoryService categoryService;

   /*public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }*/

    @GetMapping
    public Page<CategoryDTO> getAllCategory(@RequestParam(defaultValue = "0") int page,
                                            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return categoryService.getAllCategory(pageable);
    }

    @PostMapping
    public void createCategory(@RequestBody @Valid CategoryDTO categoryDTO) {
        categoryService.createCategory(categoryDTO);
    }
    @PutMapping("/{id}")
    public void updateCategory(@PathVariable Long id, @RequestBody CategoryDTO updateCategoryDTO){
        categoryService.updateCategory(id,updateCategoryDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }


}
