package com.revature.justinchen.di;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Get bean
        MessageClient client = (MessageClient) context.getBean("messageClient");
        client.processMessage("Hello via Email!");
        client.setService(new SMSService());
        client.processMessage("Hello via SMS!");
        context.close();
    }
}