package com.revature.payproc.anno.jc;
import org.springframework.stereotype.Service;

@Service("creditCardPay")
public class CreditCardPay implements PaymentService {
    @Override
    public void payProc(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
