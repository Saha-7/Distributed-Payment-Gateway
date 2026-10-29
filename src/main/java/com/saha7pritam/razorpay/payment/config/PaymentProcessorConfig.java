package com.saha7pritam.razorpay.payment.config;

import com.saha7pritam.razorpay.common.enums.PaymentMethod;
import com.saha7pritam.razorpay.payment.processor.PaymentProcessor;
import com.saha7pritam.razorpay.payment.processor.strategy.CardPaymentProcessor;
import com.saha7pritam.razorpay.payment.processor.strategy.NetBankingPaymentProcessor;
import com.saha7pritam.razorpay.payment.processor.strategy.UpiPaymentProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class PaymentProcessorConfig {


    @Bean
    public Map<PaymentMethod, PaymentProcessor> paymentProcessorMap() {
        return Map.of(
                PaymentMethod.CARD, new CardPaymentProcessor(),
                PaymentMethod.NETBANKING, new NetBankingPaymentProcessor(),
                PaymentMethod.UPI, new UpiPaymentProcessor()
        );
    }
}
