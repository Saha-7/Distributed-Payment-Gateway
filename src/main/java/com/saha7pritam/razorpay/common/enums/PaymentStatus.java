package com.saha7pritam.razorpay.common.enums;

public enum PaymentStatus {
    CREATED,
    AUTHORIZING,
    AUTHORIZED,
    CAPTURING,
    CAPTURED,
    REFUNDING,
    PARTIALLY_REFUNDED,
    REFUNDED,
    FAILED,
    AUTH_EXPIRED,
    CANCELLED,
    SETTLED
}
