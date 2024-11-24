package com.example.point_of_sales.repositories;

import com.example.point_of_sales.models.orm.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

    ProductEntity findByBarcode (String barcode) ;

}
