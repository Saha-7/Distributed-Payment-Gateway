package com.saha7pritam.razorpay.payment.processor.strategy;

import com.saha7pritam.razorpay.payment.processor.PaymentProcessor;
import com.saha7pritam.razorpay.payment.processor.dto.PaymentProcessorRequest;
import com.saha7pritam.razorpay.payment.processor.dto.PaymentProcessorResponse;

public class NetBankingPaymentProcessor implements PaymentProcessor {

    @Override
    public PaymentProcessorResponse charge(PaymentProcessorRequest request) {
        return null;
    }
}
