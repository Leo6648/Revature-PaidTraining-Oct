package com.revature.payproc.jc;

public class OrderService {
    private PaymentService paymentService;

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    
    public void placeOrder(double amount) {
        System.out.println("Placing order...");
        paymentService.pay(amount);
        System.out.println("Order placed successfully!");
    }
}
