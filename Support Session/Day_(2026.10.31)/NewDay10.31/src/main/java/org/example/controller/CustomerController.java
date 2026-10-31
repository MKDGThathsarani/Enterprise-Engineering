package org.example.controller;

import org.example.model.Customer;
import org.example.services.CustomerServices; // මේක අනිවාර්යයෙන් එකතු කරන්න
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    // @Autowired දාන්න. මේකෙන් Spring විසින් object එක හදලා දෙනවා.
    // new CustomerServices() කියලා දාන්න එපා, ඒක වැරදි ක්‍රමයක්.
    @Autowired
    private CustomerServices customerService;

    @PostMapping("/add")
    public Boolean addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping("/get-all")
    public List<Customer> getAll(){
        return customerService.getAll();
    }
}