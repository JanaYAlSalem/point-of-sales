package com.example.point_of_sales.services;

import com.example.point_of_sales.models.dto.OrderDto;
import com.example.point_of_sales.models.orm.OrderEntity;
import com.example.point_of_sales.models.orm.SaleEntity;
import com.example.point_of_sales.repositories.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepo saleRepo;

    private OrderService orderService;

    public SaleService(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderEntity saveSale(List<OrderDto> orderDto) {
        if (orderDto.size() == 0)
            return null;
        OrderEntity ord = this.orderService.saveOrder(orderDto);
        orderDto.forEach(o -> {
            SaleEntity sale = new SaleEntity();
            sale.setOrderId(ord.getOrderId());
            sale.setProductId(o.getProductId());
            this.saleRepo.save(sale);
        });
        return ord;
    }

}
