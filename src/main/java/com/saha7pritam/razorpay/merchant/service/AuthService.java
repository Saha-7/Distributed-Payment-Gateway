package com.saha7pritam.razorpay.merchant.service;

import com.saha7pritam.razorpay.merchant.dto.request.LoginRequest;
import com.saha7pritam.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.saha7pritam.razorpay.merchant.dto.response.LoginResponse;
import com.saha7pritam.razorpay.merchant.dto.response.MerchantResponse;
import jakarta.validation.Valid;

public interface AuthService {
    MerchantResponse signup( MerchantSignupRequest request);

    LoginResponse login(LoginRequest request);
}
