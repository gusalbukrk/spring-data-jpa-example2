package com.example.demo2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {}
