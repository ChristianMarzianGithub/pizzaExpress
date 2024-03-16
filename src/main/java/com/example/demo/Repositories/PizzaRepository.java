package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.PizzaEntity;

@Repository
public interface PizzaRepository extends JpaRepository<PizzaEntity,Integer>{

}
