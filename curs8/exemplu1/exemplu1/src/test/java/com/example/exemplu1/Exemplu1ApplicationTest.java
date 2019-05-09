package com.example.exemplu1;

import com.example.exemplu1.sender.MessageSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Exemplu1ApplicationTest {

    @Value("${destination.queue}")
    private String destination;

    @Autowired
    private MessageSender sender;

    @Test
    public void testSend() throws Exception {
        sender.send(destination, "Hello Spring JMS ActiveMQ!");
    }
}