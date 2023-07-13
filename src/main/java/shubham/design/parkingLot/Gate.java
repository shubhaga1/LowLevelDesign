package shubham.design.parkingLot;

public class Gate {
    int id;
    ParkingAttendent attendent;
}

class EntryGate extends Gate {
    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        return null;
    }
}

class ExitGates extends Gate {
    public PaymentReceipt processPayment(ParkingTicket ticket, PaymentType pt) {
        return null;
    }
}