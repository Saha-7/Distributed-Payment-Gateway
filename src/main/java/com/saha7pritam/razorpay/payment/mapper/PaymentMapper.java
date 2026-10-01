package com.saha7pritam.razorpay.payment.mapper;

import com.saha7pritam.razorpay.payment.entity.Payment;
import com.saha7pritam.razorpay.payment.dto.response.PaymentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PaymentMapper {

    @Mapping(target = "orderId", source = "order.id")
    PaymentResponse toResponse(Payment payment);

    List<PaymentResponse> toResponseList(List<Payment> paymentList);

}
