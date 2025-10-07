package com.revature.payproc.anno.jc;
import org.springframework.stereotype.Service;

@Service("paypalPay")
public class PaypalPay implements PaymentService {
    @Override
    public void payProc(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
    
}
