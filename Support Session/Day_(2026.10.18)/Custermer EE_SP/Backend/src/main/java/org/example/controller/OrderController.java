package org.example.controller;

import org.example.model.Order;
import org.example.service.impl.OrderServicesImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Order")
public class OrderController {
    @GetMapping("/get-all")
    public List<Order> getall(){
        return new OrderServicesImpl().getAllOrder();
    }
}
