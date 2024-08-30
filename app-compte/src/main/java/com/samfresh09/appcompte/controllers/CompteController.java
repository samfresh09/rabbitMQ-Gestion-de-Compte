package com.samfresh09.appcompte.controllers;

import com.samfresh09.appcompte.entities.Compte;
import com.samfresh09.appcompte.services.CompteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CompteController {

    private CompteService compteService;

    @PostMapping("/account")
    public void createCompte(@RequestBody Compte compte) {
        this.compteService.createCompte(compte);
    }
}
