package Task03;

import Task03.Vehicle.*;
import Task03.payments.*;

public class Main {
    public static void main(String[] args) {

        // --- Create Vehicle objects ---
        Vehicle car = new Car("Toyota", "Corolla", 2022, 4);
        Vehicle truck = new Truck("Volvo", "FH16", 2020, 18.5);
        Vehicle bike = new Motorcycle("Honda", "CBR500R", 2023, false);

        // --- Create PaymentMethod objects ---
        PaymentMethod creditCard = new CreditCard("1234567890123456");
        PaymentMethod paypal = new PayPal("user@example.com");
        PaymentMethod bankTransfer = new BankTransfer("SL-0011223344");

        // --- Create LeaseContract objects ---
        LeaseContract lease1 = new LeaseContract(car, creditCard);
        LeaseContract lease2 = new LeaseContract(truck, paypal);
        LeaseContract lease3 = new LeaseContract(bike, bankTransfer);

        // --- Process each lease ---
        lease1.processLease(250000.00);
        lease2.processLease(800000.00);
        lease3.processLease(120000.00);

        // --- Optional: Demonstrate Checkout class separately ---
        System.out.println("=== Additional Checkout Demonstration ===");
        Checkout checkout = new Checkout(paypal);
        checkout.processPayment(50000.00);
    }
}
