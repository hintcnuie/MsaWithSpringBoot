package com.example.hellospringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

/**
 * 队列消息控制器
 */
@RestController
public class QueueProducerController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    /**
     * 消息生产者
     */
    @RequestMapping("/send")
    public void send(@RequestBody String msg){
        this.jmsMessagingTemplate.convertAndSend(this.queue,msg);
    }

}
