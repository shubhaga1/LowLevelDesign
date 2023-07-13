package shubham.design.parkingLot;

import java.util.Date;

public class PaymentReceipt {
    int id;
    Date createdAt;
    double totalCost;
    PaymentStatus payStatus;
}

enum PaymentType {
    DEBIT_CARD, CREDIT_CARD, NETBANKING, UPI, CASH
}

enum PaymentStatus {
    PAID, UNPAID, ACTIVE
}