package org.example.controller;

import org.example.model.Product;
import org.example.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    // අලුතින් Method එකක් හැදුවා
    @GetMapping("/Products")
    public List<Product> getProducts() {
        ProductServiceImpl service = new ProductServiceImpl();
        return service.getProduct(); // Service එකේ method එක call කරනවා
    }

    @PostMapping("/create-product")
    public void createProduct(@RequestBody Product product){
        ProductServiceImpl service = new ProductServiceImpl();
        service.createProduct(product);
    }
}