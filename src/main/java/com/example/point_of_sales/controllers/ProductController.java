package com.example.point_of_sales.controllers;


import com.example.point_of_sales.models.orm.ProductEntity;
import com.example.point_of_sales.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/products")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping(path = "/addProduct")
    public ProductEntity addProduct(@RequestBody ProductEntity product) {
        return this.productService.addProduct(product);
    }

    @PostMapping(path = "/updateProduct")
    public ProductEntity updateProduct(@RequestBody ProductEntity product) {
        return this.productService.updateProduct(product);
    }

    @DeleteMapping(path = "/deleteProduct")
    public String deleteProduct(@RequestParam Integer productId) {
        try {
            this.productService.deleteProduct(productId);
            return "The product has been deleted.";
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
    }
    @GetMapping(path = "/getProductByBarcode")
    public ProductEntity getProductByBarcode (@RequestParam String barcode) {
        return this.productService.getProductByBarcode(barcode);
    }

    @GetMapping(path ="/getProductById")
    public ProductEntity getProductById (@RequestParam Integer productId) {
        return this.productService.getProductById(productId);
    }

    @GetMapping(path ="/getAllProducts")
    public List<ProductEntity> getAllProducts () {
        return this.productService.getAllProducts();
    }
}
