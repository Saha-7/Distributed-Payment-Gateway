package com.saha7pritam.razorpay.vault.dto.response;

import com.saha7pritam.razorpay.common.enums.CardBrand;

public record TokenizeResponse(
        String token,
        String lastFour,
        CardBrand cardBrand,
        Integer expiryMonth,
        Integer expiryYear
) {
}
