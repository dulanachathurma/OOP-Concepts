package Task03;

import Task03.payments.PaymentMethod;

public class Checkout {
    private PaymentMethod paymentMethod;

    public Checkout(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
}
