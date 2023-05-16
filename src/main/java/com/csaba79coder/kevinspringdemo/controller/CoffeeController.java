package com.csaba79coder.kevinspringdemo.controller;

import com.csaba79coder.kevinspringdemo.dto.CoffeeDto;
import com.csaba79coder.kevinspringdemo.dto.NewCoffeeDto;
import com.csaba79coder.kevinspringdemo.service.CoffeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CoffeeController {

    private final CoffeeService coffeeService;

    @RequestMapping(value = "/kevin/coffees",
            method = RequestMethod.GET,
            produces = "application/json")
    public ResponseEntity<List<CoffeeDto>> renderAllCoffees() {
        return ResponseEntity.status(200).body(coffeeService.renderAllCoffees());
    }

    @RequestMapping(value = "/kevin/coffees",
            method = RequestMethod.POST,
            produces = "application/json")
    public ResponseEntity<CoffeeDto> addNewCoffee(@RequestBody NewCoffeeDto coffeeDto) {
        return ResponseEntity.status(201).body(coffeeService.addNewCoffee(coffeeDto));
    }
}
