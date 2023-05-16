package com.csaba79coder.kevinspringdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewCoffeeDto {

    private String name;

    private String description;

    private double price;

    private boolean inStock;

    private boolean hasExtraSugar;
}
