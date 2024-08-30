package com.samfresh09.appcompte.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Compte {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String telephone;
}
