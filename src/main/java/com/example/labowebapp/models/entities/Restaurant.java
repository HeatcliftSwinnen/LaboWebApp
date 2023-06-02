package com.example.labowebapp.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity @Builder @AllArgsConstructor @NoArgsConstructor @Setter @Getter @ToString
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(insertable = false,updatable = false)
    private String name;

    @Embedded
    private Adresse adresse;

    @ManyToMany(
            mappedBy = "favoris",
            cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER)
    private Set<Client> clients;
}
