package com.example.narxoz1.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    Long id;
    String name;
    String description;
    double price;


}
