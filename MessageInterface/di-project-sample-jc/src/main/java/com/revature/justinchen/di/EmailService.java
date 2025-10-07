package com.revature.justinchen.di;

public class EmailService implements MessageService {
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
        System.out.println("Email Sent: " + message);
    }
    
}