package com.saha7pritam.razorpay.payment.gateway.dto;

import com.saha7pritam.razorpay.common.entity.Money;
import com.saha7pritam.razorpay.common.enums.PaymentMethod;

import java.util.Map;
import java.util.UUID;

public record PaymentRequest (
        UUID paymentId,
        UUID orderId,
        UUID merchantId,
        Money amount,
        PaymentMethod method,
        Map<String, Object> methodDetails
){

}
