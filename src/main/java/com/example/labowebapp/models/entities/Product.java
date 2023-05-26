package com.example.labowebapp.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity @Builder @AllArgsConstructor @NoArgsConstructor @Setter @Getter @ToString
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
}
