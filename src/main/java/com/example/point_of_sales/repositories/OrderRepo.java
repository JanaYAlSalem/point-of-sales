package com.example.point_of_sales.repositories;

import com.example.point_of_sales.models.orm.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {
}