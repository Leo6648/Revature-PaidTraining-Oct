package com.revature.payproc.anno.jc;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class PayProcess {
    private final PayService creditCardService;
    private final PayService paypalService;
    @Autowired
    public PayProcess(PayService creditCardService, PayService paypalService) {
        this.creditCardService = creditCardService;
        this.paypalService = paypalService;
    }

    public void processCreditCard(double amount) {
        creditCardService.payProc(amount);
    }

    public void processPaypal(double amount) {
        paypalService.payProc(amount);
    }
}

