package com.anth.ecommerce.backend.module.product.application.service;

import com.anth.ecommerce.backend.module.category.domain.Category;
import com.anth.ecommerce.backend.module.category.infraestructure.CategoryRepository;
import com.anth.ecommerce.backend.module.product.domain.Product;
import com.anth.ecommerce.backend.module.product.domain.dto.ProductDTO;
import com.anth.ecommerce.backend.module.product.infraestructure.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;


    public Page<ProductDTO> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable).map(this::convertToDTO);

    }

    public void createProduct(ProductDTO productDTO) {
        Product product = convetToEntity(productDTO);
        productRepository.save(product);

    }


    public void updateProduct(Integer id, ProductDTO updateProductDTO) {
        Product exitingProduct = productRepository.findById(id).orElseThrow();

        exitingProduct.setUpdatedAt(updateProductDTO.getUpdatedAt());
        exitingProduct.setUpdatedBy(updateProductDTO.getUpdatedBy());
    }


    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    private Product convetToEntity(ProductDTO productDTO) {
        Product product = new Product();

        product.setNameProduct(productDTO.getNameProduct());
        product.setDescriptionProduct(productDTO.getDescriptionProduct());
        product.setPrice(productDTO.getPrice());
        product.setStock(productDTO.getStock());
        product.setStatus(productDTO.getStatus());
        product.setDelete(productDTO.isDelete());
        product.setCreatedAt(productDTO.getCreatedAt());
        product.setCreatedBy(productDTO.getCreatedBy());

        if (productDTO.getCategoryId() != null) {
            Category category = new Category();
            category.setId(productDTO.getCategoryId());
            product.setCategory(category);
        }

        return product;
    }

    private ProductDTO convertToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setCategoryId(product.getCategory().getId());
        productDTO.setNameProduct(product.getNameProduct());
        productDTO.setDescriptionProduct(product.getDescriptionProduct());
        productDTO.setPrice(product.getPrice());
        productDTO.setStock(product.getStock());
        productDTO.setStatus(product.getStatus());
        productDTO.setDelete(product.isDelete());
        productDTO.setCreatedAt(product.getCreatedAt());
        productDTO.setCreatedBy(product.getCreatedBy());
        productDTO.setUpdatedAt(product.getUpdatedAt());
        productDTO.setUpdatedBy(product.getUpdatedBy());

        return productDTO;
    }


}
