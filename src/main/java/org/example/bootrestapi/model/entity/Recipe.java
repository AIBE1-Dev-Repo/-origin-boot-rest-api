package org.example.bootrestapi.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // JPA
@Data // Lombok
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // SEQUENCE는 MySQL에서 호환 안된다!
    long id;
    String name;
    String description;
}