package org.example.service;

import org.example.model.Product;
import java.util.Arrays;
import java.util.List;

public class ProductServiceImpl {


    // ඔබ ඉල්ලපු විදිහට new Product ඇතුළේ new Product එක අයින් කළා
    public List<Product> getProduct(){
        return Arrays.asList(
                new Product("t-shirt","A Red Mens Cloth",true),
                new Product("tb-shirt","A Red Mens Cloth",true)
        );
    }

    public void createProduct(Product product){
            System.out.println(product);
        }
    }
