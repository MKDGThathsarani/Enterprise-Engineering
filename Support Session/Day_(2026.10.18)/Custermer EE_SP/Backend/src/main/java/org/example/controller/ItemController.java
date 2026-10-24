package org.example.controller;

import org.example.model.Item;
import org.example.service.impl.ItemServicesImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Item")

import java.util.List;

public class ItemController {
    @GetMapping("/get-all")
    public List<Item> getall(){
        return new ItemServicesImpl().getItem();
    }
}
