package com.saha7pritam.razorpay.payment.processor;

import com.saha7pritam.razorpay.payment.processor.dto.PaymentProcessorRequest;
import com.saha7pritam.razorpay.payment.processor.dto.PaymentProcessorResponse;

public interface PaymentProcessor {

    PaymentProcessorResponse charge(PaymentProcessorRequest request);
}
