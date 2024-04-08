package com.anth.ecommerce.backend.module.category.application.service;

import com.anth.ecommerce.backend.module.category.domain.Category;
import com.anth.ecommerce.backend.module.category.domain.DTO.CategoryDTO;
import com.anth.ecommerce.backend.module.category.infraestructure.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CategoryService {
    private final CategoryRepository categoryRepository;

    public Page<CategoryDTO> getAllCategory(Pageable pageable) {
        return categoryRepository.findAll(pageable)
                .map(this::conveToDTO);

    }

    public void createCategory(CategoryDTO categoryDTO) {
        Category category = conveToEntity(categoryDTO);
        categoryRepository.save(category);
    }

        public void updateCategory (Long id, CategoryDTO updateCategoryDTO){
            Category exitingCategory = categoryRepository.findById(id).orElseThrow();

            exitingCategory.setUpdatedAt(updateCategoryDTO.getUpdatedAt());
            exitingCategory.setUpdatedBy(updateCategoryDTO.getUpdatedBy());
        }

        public void deleteCategory (Long id){
            categoryRepository.deleteById(id);
        }


        private Category conveToEntity (CategoryDTO categoryDTO){
            Category category = new Category();
            category.setId(categoryDTO.getId());
            category.setCategoryName(categoryDTO.getCategoryName());
            category.setStatus(categoryDTO.getStatus());
            category.setCreatedAt(category.getCreatedAt());
            return category;
        }
        private CategoryDTO conveToDTO (Category category){
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(category.getId());
            categoryDTO.setCategoryName(category.getCategoryName());
            categoryDTO.setStatus(category.getStatus());
            categoryDTO.setCreatedAt(category.getCreatedAt());
            categoryDTO.setCreatedBy(category.getCreatedBy());
            categoryDTO.setUpdatedAt(category.getUpdatedAt());
            categoryDTO.setUpdatedBy(category.getUpdatedBy());
            return categoryDTO;
        }

    }
