package com.ouahidi.commandesevice.modele;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter

public class Client {
    private Long idClient;
    private String nom;
    private Integer age;
    private String ville;
}