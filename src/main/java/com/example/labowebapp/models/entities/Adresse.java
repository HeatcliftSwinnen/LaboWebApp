package com.example.labowebapp.models.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Adresse {
    private String name;
}
