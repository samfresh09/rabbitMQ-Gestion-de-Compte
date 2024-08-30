package com.samfresh09.appcompte.services;

import com.samfresh09.appcompte.entities.Compte;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CompteService {
    private RabbitmqService rabbitmqService;
    public void createCompte(Compte compte) {
        //faire des traitement de creation de compte
        this.rabbitmqService.sendMessage(compte);
    }
}
