package com.saha7pritam.razorpay.payment.config;

import com.saha7pritam.razorpay.common.enums.PaymentMethod;
import com.saha7pritam.razorpay.payment.gateway.adapter.CardPaymentAdapter;
import com.saha7pritam.razorpay.payment.gateway.PaymentAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;


@Configuration
public class PaymentAdapterConfig {
    @Bean
    public Map<PaymentMethod, PaymentAdapter> payamntAdapterMap(){
        return Map.of(
                PaymentMethod.CARD, new CardPaymentAdapter(),
                PaymentMethod.NETBANKING, new CardPaymentAdapter(),
                PaymentMethod.UPI, new CardPaymentAdapter()
        );
    }
}
