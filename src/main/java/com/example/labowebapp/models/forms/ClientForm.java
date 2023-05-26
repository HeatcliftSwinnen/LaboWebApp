package com.example.labowebapp.models.forms;

import com.example.labowebapp.models.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientForm {
    @Size(max = 50, message = "Taille max fixée à 50 caractères")
    private String firstname;

    @NotBlank(message = "Champ Obligatoire")
    @Size(max = 60, message = "Taille max fixée à 60 caractères")
    private String lastname;

    @NotBlank(message = "Champ Obligatoire")
    @Size(max = 20, message = "Taille max fixée à 20 caractères")
    private String telephoneNumber;

    public Client toEntity(){
        return Client.builder()
                .firstname(getFirstname())
                .lastname(getLastname())
                .telephoneNumber(getTelephoneNumber())
                .build();
    }
}
