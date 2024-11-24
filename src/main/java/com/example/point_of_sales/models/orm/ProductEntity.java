package com.example.point_of_sales.models.orm;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "products")
@Data
@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "products_id")
    private Integer productsId;

    @Column(name = "products_name")
    private String productsName;

    @Column(name = "products_price")
    private Double productsPrice;

    @Column(name = "barcode")
    private String barcode;
}