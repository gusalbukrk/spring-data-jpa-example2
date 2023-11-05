package com.example.demo2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruits") // by default, table name would be set to `fruit`
public class Fruit {
  @Id
  // set field to `auto_increment`
  // default is GenerationType.SEQUENCE (which creates a sequence table)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int id;

  @Column(length = 50) // set column type to `varchar(50)`
  public String name;
}
