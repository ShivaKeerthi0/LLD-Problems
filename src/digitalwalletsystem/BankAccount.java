package digitalwalletsystem;


public class BankAccount {
    int accountId;
    User user;
    double balanceAmount;
    BankAccountType accountType;
    Bank bank;
    Currency currency;

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public User getUser() {
        return user;
    }

    public Bank getBankDetails() {
        return bank;
    }

    public void creditAmount(double amount){
        this.balanceAmount += amount;
    }

    public void debitAmount(double amount){
        this.balanceAmount -= amount;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }
}
