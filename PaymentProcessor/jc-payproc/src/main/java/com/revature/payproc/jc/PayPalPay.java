package com.revature.payproc.jc;

public class PayPalPay implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
