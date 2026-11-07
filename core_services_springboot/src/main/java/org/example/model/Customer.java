package org.example.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String name;
    private String contactNumber;
    private int age;
    boolean isActive;
}
