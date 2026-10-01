package com.saha7pritam.razorpay.operations.entity;

import com.saha7pritam.razorpay.common.entity.BaseEntity;
import jakarta.persistence.*;

public class SettlementPayment extends BaseEntity {

    @EmbeddedId
    private SettlementPaymentId id;

    @MapsId("settlementId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "settlement_id", nullable = false)
    private Settlement settlement;
}
