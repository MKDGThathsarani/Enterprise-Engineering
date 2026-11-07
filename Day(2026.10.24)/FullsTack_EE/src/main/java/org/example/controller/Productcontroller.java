package org.example.controller;

import org.example.model.Product;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.service.ProductServicesimpl;

import java.util.List;

@RestController
@CrossOrigin
public class Productcontroller {

    @GetMapping("get-products")
    List<Product>getProduct(){
        ProductServicesimpl service = new ProductServicesimpl();
        List<Product> productList = service.getProductList();
        return productList;
    }
}
