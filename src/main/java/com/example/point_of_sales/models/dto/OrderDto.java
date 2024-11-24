package com.example.point_of_sales.models.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class OrderDto {
    private Integer productId;
    private Double productPrice;
}