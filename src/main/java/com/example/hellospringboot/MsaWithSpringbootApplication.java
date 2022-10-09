package com.example.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.jms.annotation.EnableJms;

/**
 * MSA with SpringBoot
 *
 */
@SpringBootApplication
@EnableCaching//开启缓冲
@EnableJms
public class MsaWithSpringbootApplication {
//    @Bean
//    public Queue queue(){
//        return new ActiveMQQueue("active.queue");
//    }
    public static void main(String[] args) {
        SpringApplication.run(MsaWithSpringbootApplication.class, args);
    }

}
