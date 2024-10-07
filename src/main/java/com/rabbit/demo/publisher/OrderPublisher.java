package com.rabbit.demo.publisher;

import com.rabbit.demo.configuration.RabbitConf;
import com.rabbit.demo.dto.Order;
import com.rabbit.demo.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName){
        order.setOrder_id(UUID.randomUUID().toString());

        OrderStatus orderStatus = new OrderStatus(order, "PROCESS", "order placed successfully in " + restaurantName);
        rabbitTemplate.convertAndSend(RabbitConf.NAME, RabbitConf.ROUTING_KEY, orderStatus);
        return "Success";
    }

    public OrderPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
}
