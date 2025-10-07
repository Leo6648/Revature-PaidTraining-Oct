package com.revature.payproc.jc;

public class CreditCardPay implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
    
}
