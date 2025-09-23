package com.example.narxoz1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {
    Long id;
    String name;
    String description;
    double price;


}
