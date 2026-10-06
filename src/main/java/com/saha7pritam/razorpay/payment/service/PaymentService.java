package com.saha7pritam.razorpay.payment.service;


import com.saha7pritam.razorpay.payment.dto.request.PaymentinitRequest;
import com.saha7pritam.razorpay.payment.dto.response.PaymentResponse;

import java.util.UUID;

public interface PaymentService {

    PaymentResponse initiate(UUID merchantId, PaymentinitRequest request);
}
