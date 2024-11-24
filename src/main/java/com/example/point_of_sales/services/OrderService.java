package com.example.point_of_sales.services;

import com.example.point_of_sales.models.dto.OrderDto;
import com.example.point_of_sales.models.orm.OrderEntity;
import com.example.point_of_sales.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;


    public OrderEntity saveOrder(List<OrderDto> orderDto) {
        Double total = 0.0;
        for (OrderDto o : orderDto) {
            total += o.getProductPrice();
        }
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setTotal(total);
        return this.orderRepo.save(orderEntity);
    }

    public List<OrderEntity> getAllOrders () {
        return this.orderRepo.findAll();
    }


}
