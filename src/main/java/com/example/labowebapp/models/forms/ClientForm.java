package com.example.labowebapp.models.forms;

import com.example.labowebapp.models.entities.Adresse;
import com.example.labowebapp.models.entities.Client;
import com.example.labowebapp.models.enums.Gender;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientForm {
    @NotBlank(message = "Champ Obligatoire")
    @Size(max = 50, message = "Taille max fixée à 50 caractères")
    private String firstname;

    @NotBlank(message = "Champ Obligatoire")
    @Size(max = 60, message = "Taille max fixée à 60 caractères")
    private String lastname;

    @NotBlank(message = "Champ Obligatoire")
    private LocalDate birthdate;

    @NotBlank(message = "Champ Obligatoire")
    private Gender gender;

    @NotBlank(message = "Champ Obligatoire")
    @Size(max = 60, message = "Taille max fixée à 60 caractères")
    private String mail;

    @NotBlank(message = "Champ Obligatoire")
    private String password;

    @NotBlank(message = "Champ Obligatoire")
    private Adresse adresse;

    @NotBlank(message = "Champ Obligatoire")
    @Size(max = 20, message = "Taille max fixée à 20 caractères")
    private String telephoneNumber;

    public ClientForm(String email) {
        this.mail = email;
    }

    public Client toEntity(){
        return Client.builder()
                .firstname(getFirstname())
                .lastname(getLastname())
                .birthdate(getBirthdate())
                .mail(getMail())
                .password(getPassword())
                .adresse(getAdresse())
                .telephoneNumber(getTelephoneNumber())
                .build();
    }
}
