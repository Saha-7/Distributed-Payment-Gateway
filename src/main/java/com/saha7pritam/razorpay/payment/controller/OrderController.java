package com.saha7pritam.razorpay.payment.controller;


import com.saha7pritam.razorpay.payment.dto.request.CreateOrderRequest;
import com.saha7pritam.razorpay.payment.dto.response.OrderResponse;
import com.saha7pritam.razorpay.payment.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    UUID merchantId = UUID.fromString("b06bcf6e-5a3d-424a-9d29-83e31c30f3e4");

    @PostMapping
    public ResponseEntity<OrderResponse> create(@RequestBody @Valid CreateOrderRequest request){
        return ResponseEntity.ok(orderService.create(merchantId, request));
    }

}
