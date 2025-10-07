package com.revature.justinchen.di;

public class Main {
    public static void main(String[] args) {
        MessageClient client = new MessageClient();
        client.setService(new EmailService());
        client.processMessage("Hello via Email!");
        client.setService(new SMSService());
        client.processMessage("Hello via SMS!");
    }
}