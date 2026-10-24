package org.example.service.impl;

import org.example.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderServicesImpl {

    List<Order> Order = new ArrayList<>();

    public List<Order> getAllOrder() {
        Order.add(new Order(
                001,
                "Rice",
                3
        ));

        Order.add(new Order(
                002,
                "Rice",
                3
        ));

        Order.add(new Order(
                003,
                "Rice",
                3
        ));
        Order.add(new Order(
                004,
                "Rice",
                3
        ));Order.add(new Order(
                005,
                "Rice",
                3
        ));

        return Order;
    }
}

