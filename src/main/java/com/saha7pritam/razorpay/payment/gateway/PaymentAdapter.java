package com.saha7pritam.razorpay.payment.gateway;

import com.saha7pritam.razorpay.payment.gateway.dto.PaymentRequest;
import com.saha7pritam.razorpay.payment.gateway.dto.PaymentResult;

public interface PaymentAdapter {

    PaymentResult initiate(PaymentRequest request);
}
