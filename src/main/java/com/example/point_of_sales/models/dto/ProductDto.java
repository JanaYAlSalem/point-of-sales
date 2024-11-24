package com.example.point_of_sales.models.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Integer productsId;
    private String productsName;
    private Double productsPrice;
    private String barcode;
}