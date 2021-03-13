package com.darksiderht.ps.api.service;

import com.darksiderht.ps.api.entity.Payment;
import com.darksiderht.ps.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment doPayment(Payment payment){
        payment.setTransationId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }
}
