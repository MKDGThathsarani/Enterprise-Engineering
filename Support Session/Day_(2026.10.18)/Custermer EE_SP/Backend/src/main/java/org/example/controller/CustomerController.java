package org.example.controller;

import org.example.model.Customer;
import org.example.service.CustomerServiices;
import org.example.service.impl.CustomerServiicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/customer")

public class CustomerController {

    @Autowired
    CustomerServiices serviices;

    @GetMapping("/get-all")
    public List<Customer> getall(){
        return new CustomerServiicesImpl().getAllCustomer();
    }
}
