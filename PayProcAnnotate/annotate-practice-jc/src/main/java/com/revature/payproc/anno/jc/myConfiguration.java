package com.revature.payproc.anno.jc;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = "com.revature.payproc.anno.jc")
public class myConfiguration {
    @Bean
    public PayService creditCardPayment() {
        return new CreditCardPayment();
    }

    @Bean
    public PayService paypalPay() {
        return new PaypalPay();
    }

    @Bean
    public PayProcess payProcess() {
        // you can choose which payment service to inject
        return new PayProcess(creditCardPayment(), paypalPay());
    }
}