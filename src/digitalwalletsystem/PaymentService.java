package digitalwalletsystem;

public interface PaymentService {

    public void makePayment(User to, User from, double amount, CreditCard card, String upiId);
}
