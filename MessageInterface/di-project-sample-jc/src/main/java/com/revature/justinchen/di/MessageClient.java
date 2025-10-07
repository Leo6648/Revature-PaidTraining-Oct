package com.revature.justinchen.di;

public class MessageClient {
    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public void processMessage(String message) {
        if (service == null) {
            throw new IllegalStateException("No MessageService has been set!");
        }
        service.setMessage(message);
        System.out.println("Processed message: " + service.getMessage());
    }
        // custom init method
    public void init() {
        System.out.println("MessageClient bean is initializing...");
    }

    // custom destroy method
    public void cleanup() {
        System.out.println("MessageClient bean is being destroyed...");
    }
}

