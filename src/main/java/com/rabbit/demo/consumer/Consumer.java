package com.rabbit.demo.consumer;

import com.rabbit.demo.configuration.RabbitConf;
import com.rabbit.demo.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = RabbitConf.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus){
        System.out.println("message from queue" + orderStatus.toString());
    }
}
