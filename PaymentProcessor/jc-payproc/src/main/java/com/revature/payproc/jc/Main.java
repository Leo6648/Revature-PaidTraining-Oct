package com.revature.payproc.jc;

import com.revature.payproc.jc.OrderService;
import com.revature.payproc.jc.PaymentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            // New instance of OrderService with CreditCardPayment (prototype)
            OrderService order1 = context.getBean("orderService", OrderService.class);
            order1.placeOrder(100.00);

            // Get PayPal prototype bean and inject manually (alternative runtime choice)
            PaymentService paypal = context.getBean("paypalPayment", PaymentService.class);
            OrderService order2 = context.getBean("orderService", OrderService.class);
            order2.setPaymentService(paypal);
            order2.placeOrder(250.50);

            // Notice: each getBean("orderService") returns a *new* instance because of prototype scope
        }
    }
}