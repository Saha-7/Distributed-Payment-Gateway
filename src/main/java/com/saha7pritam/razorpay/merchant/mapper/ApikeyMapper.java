package com.saha7pritam.razorpay.merchant.mapper;

import com.saha7pritam.razorpay.merchant.dto.response.ApiKeyCreateResponse;
import com.saha7pritam.razorpay.merchant.dto.response.ApiKeyResponse;
import com.saha7pritam.razorpay.merchant.entity.ApiKey;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ApikeyMapper {

    ApiKeyCreateResponse toCreateResponse(ApiKey apiKey);

    List<ApiKeyResponse> toResponseList(List<ApiKey> apiKeyList);
}
