package org.example.service.impl;

import org.example.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiicesImpl {

    List<Customer> customerList = new ArrayList<>();

    public List<Customer> getAllCustomer(){
        customerList.add(new Customer(
                 1,
                "Saman",
                "Walana",
                12,
                "0778+6542"

        ));
        customerList.add(new Customer(
                2,
                "Kaman",
                "Walana",
                12,
                "0778+6542"

        ));
        customerList.add(new Customer(
                3,
                "Namal",
                "Walana",
                12,
                "0778+6542"

        ));
        customerList.add(new Customer(
                4,
                "Sunnil",
                "Walana",
                12,
                "0778+6542"

        ));
        customerList.add(new Customer(
                5,
                "Pavan",
                "Walana",
                12,
                "0778+6542"

        ));

        return customerList;
    }
}
