package com.saha7pritam.razorpay.payment.dto.request;

import com.saha7pritam.razorpay.common.enums.PaymentMethod;
import jakarta.validation.constraints.NotNull;

import java.util.Map;
import java.util.UUID;

public record PaymentinitRequest(

        @NotNull(message = "Order ID is required")
        UUID orderId,

        @NotNull(message = "Payment method is required")
        PaymentMethod method,

        Map<String, Object> methodDetails
) {
}
