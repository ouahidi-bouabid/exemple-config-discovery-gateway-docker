package com.ouahidi.produitservice.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String intitule;
    private Double prix;


}
