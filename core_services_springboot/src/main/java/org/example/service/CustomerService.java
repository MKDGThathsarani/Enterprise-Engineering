package org.example.service;

import org.example.model.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerService {

   public List<Customer> getCustomer(){

       return Arrays.asList(
               new  Customer("Githmi","0765984021",25,true),
               new Customer("Dulsh", "0741155445" , 26 , true)
       );



    }
}
