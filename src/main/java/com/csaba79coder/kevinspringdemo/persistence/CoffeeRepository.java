package com.csaba79coder.kevinspringdemo.persistence;

import com.csaba79coder.kevinspringdemo.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {

    /*@Query("SELECT c FROM Coffee c WHERE c.hasExtraSugar = ?1 AND (c.description = ?2 OR c.name = ?3) ORDER BY c.id")
    List<Coffee> findCoffeeByHasExtraSugarAndDescriptionOrNameOrderById(boolean hasExtraSugar, String description, String name);*/
}
