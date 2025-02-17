package com.samfresh09.appnotification.services;


import com.samfresh09.appnotification.entities.Compte;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RabbitMQMessageHandler {

    @RabbitListener(queues = "notification.send")
    public void getAllMessage(Compte compte) {
        log.info("Vous avez recu un nouveau message {} ",compte.getEmail());
    }

}
