package com.anth.ecommerce.backend.module.product.infraestructure.controller;

import com.anth.ecommerce.backend.module.product.application.service.ProductService;
import com.anth.ecommerce.backend.module.product.domain.dto.ProductDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")

public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public Page<ProductDTO> getAllProduct(@RequestParam(defaultValue = "0") int page,
                                          @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);

        return productService.getAllProducts(pageable);
    }

    @PostMapping
    public  void createProduct(@RequestBody ProductDTO productDTO){
        productService.createProduct(productDTO);
    }
    @PutMapping("/{id}")
    public void updateProduct(@PathVariable Integer id, @RequestBody ProductDTO updateProductDTO ){
        productService.updateProduct(id,updateProductDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
    }



}
