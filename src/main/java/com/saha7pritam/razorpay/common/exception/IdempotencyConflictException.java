package com.saha7pritam.razorpay.common.exception;

public class IdempotencyConflictException extends RuntimeException{
    public IdempotencyConflictException(String message) {
        super(message);
    }

}
