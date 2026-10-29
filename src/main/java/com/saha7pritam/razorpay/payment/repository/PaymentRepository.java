package com.saha7pritam.razorpay.payment.repository;

import com.saha7pritam.razorpay.common.enums.PaymentStatus;
import com.saha7pritam.razorpay.payment.entity.OrderRecord;
import com.saha7pritam.razorpay.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {

    List<Payment> findByOrder_Id(OrderRecord order);

    Optional<Payment> findByIdAndMerchantId(UUID merchantId, UUID paymentId);

    List<Payment> findByStatusAndCreatedAtBefore(PaymentStatus paymentStatus, LocalDateTime globalWindow);
}
