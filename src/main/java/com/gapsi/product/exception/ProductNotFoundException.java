package com.gapsi.product.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String id) {
        super("Producto con ID " + id + " no encontrado.");
    }
}
