package com.example.labowebapp.models.forms;

import com.example.labowebapp.models.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductForm {
    @NotBlank(message = "Champ obligatoire")
    @Size(max = 255, message = "Taille max fixée à 50")
    private String name;

    @NotBlank(message = "Champ obligatoire")
    private double price;

    public Product toEntity(){
        return Product.builder()
                .name(getName())
                .price(getPrice())
                .build();
    }
}
