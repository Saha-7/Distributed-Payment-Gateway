package com.saha7pritam.razorpay.payment.service;


import com.saha7pritam.razorpay.payment.dto.request.PaymentinitRequest;
import com.saha7pritam.razorpay.payment.dto.response.PaymentResponse;

import java.util.UUID;

public interface PaymentService {

    PaymentResponse initiate(UUID merchantId, PaymentinitRequest request);

    PaymentResponse capture(UUID merchantId, UUID paymentId);

    void resolveAuthorization(UUID paymentId, boolean approve, String bankRef, String errorcode, String errorDescription);
}
