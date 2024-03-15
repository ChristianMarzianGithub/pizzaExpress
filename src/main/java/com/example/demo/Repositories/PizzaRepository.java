package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Long, Pizza>{

}
