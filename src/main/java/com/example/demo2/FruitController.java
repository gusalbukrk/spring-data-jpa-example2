package com.example.demo2;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruits")
public class FruitController {
  private FruitRepository repository;

  public FruitController(FruitRepository repository) {
    this.repository = repository;
  }

  @GetMapping("")
  public List<Fruit> findAll() {
    return repository.findAll();
  }

  @PostMapping("")
  public Fruit insert(@RequestBody Fruit fruit) {
    return repository.save(fruit);
  }
}
