package com.saha7pritam.razorpay.payment.controller;


import com.saha7pritam.razorpay.payment.dto.request.PaymentinitRequest;
import com.saha7pritam.razorpay.payment.dto.response.PaymentResponse;
import com.saha7pritam.razorpay.payment.service.PaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/v1/payments")
@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    UUID merchantId = UUID.fromString("772d097e-dd6c-4025-ae44-7bf7495e359f");

    @PostMapping
    public ResponseEntity<PaymentResponse> initiate(@Valid @RequestBody PaymentinitRequest request){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(paymentService.initiate(merchantId, request));
    }
}
