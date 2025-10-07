package com.bookstore;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    public void generateInvoice(String bookTitle) {
        System.out.println("Invoice generated for book: " + bookTitle);
    }
}
