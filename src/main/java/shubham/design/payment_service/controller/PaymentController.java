package shubham.design.payment_service.controller;

import shubham.design.payment_service.entity.Payment;
import shubham.design.payment_service.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class PaymentController {
    @Inject
    private PaymentService paymentService;

    @PostMapping("/payments")
    public Payment doPayment(@RequestBody Payment payment) {
        payment.setStatus(paymentProcessing());
        return paymentService.doPayment(payment);
    }

    /*
     * Simulate thrid party payment gateway
     * for example paypal, paytm
     */
    public String paymentProcessing() {
        String resp = new Random().nextBoolean() ? "success" : "fail";
        return resp;
    }
}
