package com.samfresh09.appcrm.services;


import com.samfresh09.appcrm.entities.Compte;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RabbitMQMessageHandler {

    @RabbitListener(queues = "#{${crm.queues}.split(',')}")
    public void getAllMessage(Compte compte) {
        log.info("CRM: Vous avez recu un nouveau message {} ",compte.getNom());
    }

}
