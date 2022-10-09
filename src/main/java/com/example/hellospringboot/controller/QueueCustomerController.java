package com.example.hellospringboot.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwchen
 */
@RestController
public class QueueCustomerController {

    /**
     * 监听和读取消息
     * @param message msg
     */
    @JmsListener(destination="${spring.activemq.queue-name}", containerFactory="queueListener")
    public void readActiveQueue(String message){
        System.out.println("Received Message:" + message);
    }
}
