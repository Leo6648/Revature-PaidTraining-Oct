package com.revature.payproc.anno.jc;
import org.springframework.stereotype.Service;

@Service("creditCardPayment")
public class CreditCardPayment implements PayService {
    @Override
    public void payProc(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
