package com.example.labowebapp.models.entities;

import com.example.labowebapp.models.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


@Entity @Builder @AllArgsConstructor @NoArgsConstructor
public class Client implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

    @Column(name = "first_name",length = 50)
    private String firstname;

    @Column(name = "last_name",length = 60)
    private String lastname;

    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private LocalDate birthdate;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "mail",length = 60)
    private  String mail ;

    @Column(name = "mot_de_passe")
    private String password;

    @Embedded
    private Adresse adresse;

    @Column(name = "telephone_number",length = 20)
    private String telephoneNumber;

    @ManyToMany(
            cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER)
    private Set<Restaurant> favoris;

}
