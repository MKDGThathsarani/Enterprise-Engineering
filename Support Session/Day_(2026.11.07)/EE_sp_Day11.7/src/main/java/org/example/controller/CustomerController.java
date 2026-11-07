package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.services.CustomerServices;
import org.example.services.CustomerServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class CustomerController {
    final CustomerServices services;


    @GetMapping
    public String getName(){
        String name = services.getName();
        return  name;
    }

}
