package org.example.model;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private String name;
    private String description;
    private Double price;
    private String image;
}
