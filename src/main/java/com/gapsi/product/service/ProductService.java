package com.gapsi.product.service;

import com.gapsi.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ProductService {
    Optional<Product> getProductById(String id);
    Optional<Product> updateProduct(String id, String description, String model);
}
