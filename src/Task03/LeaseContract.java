package Task03;


import Task03.Vehicle.Vehicle;
import Task03.payments.PaymentMethod;

public class LeaseContract {
    private Vehicle vehicle;
    private PaymentMethod paymentMethod;

    public LeaseContract(Vehicle vehicle, PaymentMethod paymentMethod) {
        this.vehicle = vehicle;
        this.paymentMethod = paymentMethod;
    }

    public void processLease(double amount) {
        System.out.println("=== Processing Lease Contract ===");
        vehicle.displayDetails();
        System.out.println("Processing payment...");
        paymentMethod.pay(amount);
        System.out.println("Lease processed successfully!\n");
    }
}
