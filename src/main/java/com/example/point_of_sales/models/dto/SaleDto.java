package com.example.point_of_sales.models.dto;

import lombok.Data;

@Data
public class SaleDto {
    private Integer saleId;
    private Integer productId;
    private Integer orderId;
    private Integer createdAt;
}