package com.example.point_of_sales.services;

import com.example.point_of_sales.models.orm.ProductEntity;
import com.example.point_of_sales.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    private ProductRepo productRepo;


    public ProductEntity addProduct(ProductEntity product) {
        return this.productRepo.save(product);
    }

    public ProductEntity updateProduct(ProductEntity product) {
        return this.productRepo.save(product);
    }

    public void deleteProduct(Integer productId) {
        this.productRepo.deleteById(productId);
    }

    public ProductEntity getProductByBarcode(String barcode) {
        Optional<ProductEntity> optional = Optional.ofNullable(this.productRepo.findByBarcode(barcode));
        return optional.isPresent() ? optional.get() : null;
        // return this.productRepo.findByBarcode(barcode);
    }

    public ProductEntity getProductById(Integer productId) {
        Optional<ProductEntity> optional = this.productRepo.findById(productId);
        return optional.isPresent() ? optional.get() : null;
    }

    public List<ProductEntity> getAllProducts() {
        return this.productRepo.findAll();
    }
}
