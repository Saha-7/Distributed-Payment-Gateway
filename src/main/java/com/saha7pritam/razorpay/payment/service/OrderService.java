package com.saha7pritam.razorpay.payment.service;

import com.saha7pritam.razorpay.payment.dto.request.CreateOrderRequest;
import com.saha7pritam.razorpay.payment.dto.response.OrderResponse;
import com.saha7pritam.razorpay.payment.dto.response.PaymentResponse;

import java.util.List;
import java.util.UUID;

public interface OrderService {
    OrderResponse create(UUID merchantId, CreateOrderRequest request);

    OrderResponse getById(UUID merchantId, UUID orderId);

    OrderResponse cancel(UUID merchantId, UUID orderId);

    List<PaymentResponse> listPayments(UUID merchantId, UUID orderId);
}
