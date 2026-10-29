package com.saha7pritam.razorpay.vault.dto.request;

import com.saha7pritam.razorpay.vault.validation.ExpiryYear;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.LuhnCheck;

import java.util.UUID;

public record TokenizeRequest(

        @NotBlank(message = "PAN is required")
        @LuhnCheck(message = "Invalid PAN number")
        @Pattern(regexp = "^[0-9]{13,19}$", message = "PAN length is invalid")
        String pan,


        String cvv,

        @NotNull(message = "Expiry month is required")
        @Min(value=1, message="Expiry month must be between 1 and 12")
        @Max(value=12, message = "Expiry month must be between 1 and 12")
        Integer expiryMonth,

        @NotNull(message = "Expiry year is required")
        @ExpiryYear
        Integer expiryYear,

        UUID customerId,

        @Size(min = 3, message = "Length of card holder name must be at least 3 characters")
        String cardHolderName
) {
}
