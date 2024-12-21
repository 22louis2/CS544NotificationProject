package edu.miu.cs.cs544.lotu.springboot.notificationproject.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @JmsListener(destination = "cs544Queue")
    public void receiveMessage(String message) {
        System.out.println(message);
    }
}
