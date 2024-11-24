package com.example.point_of_sales.controllers;


import com.example.point_of_sales.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/sales")
@RestController
public class SaleController {

    @Autowired
    private SaleService saleService;
}
