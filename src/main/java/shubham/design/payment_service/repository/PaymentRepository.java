package shubham.design.payment_service.repository;

import shubham.design.payment_service.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
