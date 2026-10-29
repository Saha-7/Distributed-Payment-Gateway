package com.saha7pritam.razorpay.vault.service;

import com.saha7pritam.razorpay.common.entity.Money;
import com.saha7pritam.razorpay.payment.processor.PaymentProcessor;
import com.saha7pritam.razorpay.payment.processor.dto.PaymentProcessorResponse;
import com.saha7pritam.razorpay.vault.dto.request.TokenizeRequest;
import com.saha7pritam.razorpay.vault.dto.response.TokenizeResponse;
import jakarta.annotation.Nullable;

import java.util.Map;
import java.util.UUID;

public interface VaultService {

    TokenizeResponse tokenize(TokenizeRequest request, UUID merchantId);

    PaymentProcessorResponse charge(UUID paymentId, String token, Money amount, Map<String, Object> methodDetails);
}
