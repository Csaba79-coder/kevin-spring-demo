package com.csaba79coder.kevinspringdemo.service;

import com.csaba79coder.kevinspringdemo.dto.CoffeeDto;
import com.csaba79coder.kevinspringdemo.dto.NewCoffeeDto;
import com.csaba79coder.kevinspringdemo.persistence.CoffeeRepository;
import com.csaba79coder.kevinspringdemo.util.Mapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public List<CoffeeDto> renderAllCoffees() {
        return coffeeRepository.findAll()
                .stream()
                .map(Mapper::mapCoffeeEntityToDto)
                .collect(Collectors.toList());
    }

    public CoffeeDto addNewCoffee(NewCoffeeDto newCoffeeDto) {
        return Mapper.mapCoffeeEntityToDto(coffeeRepository.save(Mapper.mapCoffeeDtoToEntity(newCoffeeDto)));
    }
}
