package digitalwalletsystem;

import java.util.List;

public class User {
    String firstName;
    String lastName;
    Location location;
    Wallet wallet;
    List<BankAccount> bankAccountList;
    String phNumber;
    Account account;
    List<Transaction> transactionsHistory;
    List<CreditCard> creditCards;
    List<PaymentMethod> paymentMethods;
    public Location getLocation() {
        return location;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<BankAccount> getAccounts() {
        return bankAccountList;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public void addAccount(Account account){

    }

    public void addPaymentMethod(PaymentMethod paymentMethod){
    }

}
