package com.revature.payproc.anno.jc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(myConfiguration.class);

        PayProcess payProcess = context.getBean(PayProcess.class);
        payProcess.processCreditCard(100.0); // Credit card
        payProcess.processPaypal(200.0);     // PayPal

        ((AnnotationConfigApplicationContext) context).close();
    }

}