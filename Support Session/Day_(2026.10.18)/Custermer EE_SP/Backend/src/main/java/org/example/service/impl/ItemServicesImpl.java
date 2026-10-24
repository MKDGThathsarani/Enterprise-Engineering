package org.example.service.impl;

import org.example.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemServicesImpl {
    List<Item> Item = new ArrayList<>();
    public List<Item> getItem(){
         Item.add(new Item(
                 001,
                 "aaa"
         ));
        Item.add(new Item(
                002,
                "aaa"
        ));
        Item.add(new Item(
                003,
                "aaa"
        ));
     return Item;
 }
}
