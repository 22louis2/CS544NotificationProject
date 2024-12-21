package edu.miu.cs.cs544.lotu.springboot.notificationproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class NotificationProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationProjectApplication.class, args);
    }

}
