package com.saha7pritam.razorpay.merchant.api;

import com.saha7pritam.razorpay.common.dto.WebhookTarget;

import java.util.List;
import java.util.UUID;

public interface MerchantWebhookApi {
    List<WebhookTarget> getActiveConfigsForEvent(UUID merchantId, String eventType);
}
