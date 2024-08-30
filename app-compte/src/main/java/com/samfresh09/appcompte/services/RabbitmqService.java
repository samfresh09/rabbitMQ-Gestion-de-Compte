package com.samfresh09.appcompte.services;

import com.samfresh09.appcompte.entities.Compte;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RabbitmqService {
    RabbitTemplate rabbitTemplate;
    public void sendMessage(Compte compte) {
        rabbitTemplate.convertAndSend(compte);
    }

}
