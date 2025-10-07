package com.bookstore;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void processPayment(String bookTitle) {
        System.out.println("Payment processed for book: " + bookTitle);
    }
}