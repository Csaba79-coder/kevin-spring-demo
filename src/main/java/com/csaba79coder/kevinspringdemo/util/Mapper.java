package com.csaba79coder.kevinspringdemo.util;

import com.csaba79coder.kevinspringdemo.dto.CoffeeDto;
import com.csaba79coder.kevinspringdemo.dto.NewCoffeeDto;
import com.csaba79coder.kevinspringdemo.entity.Coffee;

public class Mapper {

    public static Coffee mapCoffeeDtoToEntity(NewCoffeeDto coffeeDto) {
        Coffee coffee = new Coffee();
        coffee.setName(coffeeDto.getName());
        coffee.setDescription(coffeeDto.getDescription());
        coffee.setPrice(coffeeDto.getPrice());
        coffee.setInStock(coffeeDto.isInStock());
        coffee.setHasExtraSugar(coffeeDto.isHasExtraSugar());
        return coffee;
    }

    public static CoffeeDto mapCoffeeEntityToDto(Coffee coffee) {
        CoffeeDto coffeeDto = new CoffeeDto();
        coffeeDto.setId(coffee.getId());
        coffeeDto.setName(coffee.getName());
        coffeeDto.setDescription(coffee.getDescription());
        coffeeDto.setPrice(coffee.getPrice());
        coffeeDto.setInStock(coffee.isInStock());
        coffeeDto.setHasExtraSugar(coffee.isHasExtraSugar());
        return coffeeDto;
    }

    // private constructor to prevent instantiation
    private Mapper() {

    }
}
