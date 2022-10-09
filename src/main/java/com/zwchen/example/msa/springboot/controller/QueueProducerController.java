package com.zwchen.example.msa.springboot.controller;

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
    public String send(@RequestBody String msg){
        StringBuilder sendMsg =new StringBuilder("{sendStatus:");
        String originMessage = "originMessage:\"ORIGIN_MESSAGE\"";
        try{

            this.jmsMessagingTemplate.convertAndSend(this.queue,msg);
            sendMsg.append("\" msg  sent successfully! \",");

        }catch (Exception ex){
            sendMsg.append("\" msg failed to send\",");
        }finally {
            sendMsg.append( originMessage.replaceAll("ORIGIN_MESSAGE",msg));
            sendMsg.append("}");
        }


        return sendMsg.toString();
    }

}
