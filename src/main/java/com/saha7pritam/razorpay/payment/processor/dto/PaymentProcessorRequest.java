package com.saha7pritam.razorpay.payment.processor.dto;

import com.saha7pritam.razorpay.common.entity.Money;
import com.saha7pritam.razorpay.common.enums.PaymentMethod;

import java.util.Map;

public record PaymentProcessorRequest(
        PaymentMethod method,
        Money amount,
        Map<String, Object> methodDetails
) {
}
