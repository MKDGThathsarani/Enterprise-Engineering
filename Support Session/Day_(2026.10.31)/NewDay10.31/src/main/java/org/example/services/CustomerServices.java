package org.example.services;

import org.example.model.Customer;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServices {

    private List<Customer> customerList = new ArrayList<>();

    public Boolean addCustomer(Customer customer) {
        return customerList.add(customer);
    }

    public List<Customer> getAll() {
        return customerList;
    }
}