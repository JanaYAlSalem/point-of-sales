package com.example.point_of_sales.controllers;

import com.example.point_of_sales.models.dto.OrderDto;
import com.example.point_of_sales.models.orm.OrderEntity;
import com.example.point_of_sales.services.OrderService;
import com.example.point_of_sales.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/orders")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private SaleService saleService;

    @PostMapping(path = "/saveOrder")
    public OrderEntity saveOrder (@RequestBody List<OrderDto> orderDto) {
        return this.saleService.saveSale(orderDto);
    }

    @GetMapping(path = "/getAllOrders")
    public List<OrderEntity> getAllOrders () {
        return this.orderService.getAllOrders();
    }


}
