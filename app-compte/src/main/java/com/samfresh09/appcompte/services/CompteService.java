package com.samfresh09.appcompte.services;

import com.samfresh09.appcompte.entities.Compte;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor
public class CompteService {
    private RabbitmqService rabbitmqService;
    //private RabbitTemplate template;
    private String userExchangeName;
    private String userExchangeRoutingName;
    private String notificationExchangeName;
    private String notificationExchangeRoutingName;



    public CompteService(
            //RabbitTemplate template,
            RabbitmqService rabbitmqService,

            @Value("${application.exchange.user.name}")
            String userExchangeName,

            @Value("${application.exchange.user.routing-key}")
            String userExchangeRoutingName,

            @Value("${application.exchange.notification.name}")
            String notificationExchangeName,

            @Value("${application.exchange.notification.routing-key}")
            String notificationExchangeRoutingName
    ) {
        this.rabbitmqService = rabbitmqService;
        //this.template = template;
        this.userExchangeName = userExchangeName;
        this.userExchangeRoutingName = userExchangeRoutingName;
        this.notificationExchangeName = notificationExchangeName;
        this.notificationExchangeRoutingName = notificationExchangeRoutingName;
    }

    public void createCompte(Compte compte) {
        //faire des traitement de creation de compte
            this.rabbitmqService.sendMessage(userExchangeName, userExchangeRoutingName, compte);
            this.rabbitmqService.sendMessage(notificationExchangeName, notificationExchangeRoutingName, compte);
    }
}
