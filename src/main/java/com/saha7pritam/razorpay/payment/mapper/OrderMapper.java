package com.saha7pritam.razorpay.payment.mapper;

import com.saha7pritam.razorpay.payment.dto.response.OrderResponse;
import com.saha7pritam.razorpay.payment.entity.OrderRecord;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {
    OrderResponse toResponse(OrderRecord orderRecord);
}
