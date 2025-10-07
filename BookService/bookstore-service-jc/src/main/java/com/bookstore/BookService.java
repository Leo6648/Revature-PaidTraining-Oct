package com.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private PaymentService paymentService;
    private InvoiceService invoiceService;

    // Setter for PaymentService
    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // Setter for InvoiceService
    @Autowired
    public void setInvoiceService(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void purchaseBook(String bookTitle) {
        System.out.println("Purchasing book: " + bookTitle);
        paymentService.processPayment(bookTitle);
        invoiceService.generateInvoice(bookTitle);
    }
}

