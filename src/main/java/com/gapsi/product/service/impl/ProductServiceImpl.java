package com.gapsi.product.service.impl;

import com.gapsi.product.exception.ProductNotFoundException;
import com.gapsi.product.model.Product;
import com.gapsi.product.repository.ProductRepository;
import com.gapsi.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Optional<Product> getProductById(String id) {
        return Optional.ofNullable(productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id)));
    }

    @Override
    public Optional<Product> updateProduct(String id, String description, String model) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));

        if (description != null) {
            product.setDescription(description);
        }
        if (model != null) {
            product.setModel(model);
        }

        return Optional.of(productRepository.save(product));
    }
}
