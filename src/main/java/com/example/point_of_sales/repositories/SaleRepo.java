package com.example.point_of_sales.repositories;

import com.example.point_of_sales.models.orm.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepo extends JpaRepository<SaleEntity, Integer> {
}


