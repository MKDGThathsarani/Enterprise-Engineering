package org.example.service;

import org.example.model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductServicesimpl {
    public List<Product> getProductList(){
        return Arrays.asList(
                new Product("T-Shirt","A Mens T-Shirt",200.0,null),
                new Product("A-Shirt","A Mens T-Shirt",700.0,null),
                new Product("Skirt","A Women Skirt",1200.00,null)
        );

        //ArrayList<> productList = new ArrayList();
        //productList.add(new Product()roduct)
    }
}
