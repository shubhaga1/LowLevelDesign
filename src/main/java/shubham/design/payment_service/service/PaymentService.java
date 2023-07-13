package shubham.design.payment_service.service;

import shubham.design.payment_service.entity.Payment;
import shubham.design.payment_service.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    private PaymentRepository paymentRepository;

    public Payment doPayment(Payment payment) {
        payment.setTransactionId(UUID.randomUUID().toString());
        paymentRepository.save(payment);
        return payment;
    }
}
