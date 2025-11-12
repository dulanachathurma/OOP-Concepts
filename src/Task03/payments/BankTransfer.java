package Task03.payments;

public class BankTransfer implements PaymentMethod {
    private String bankAccount;

    public BankTransfer(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via Bank Transfer to account: " + bankAccount);
    }
}
