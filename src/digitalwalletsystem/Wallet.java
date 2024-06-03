package digitalwalletsystem;

public class Wallet {
    int walletId;
    double balanceAmount;

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void addAmounToWallet(double amount){
        this.balanceAmount += amount;
    }

    public void deductAmountFromWallet(double amount){
        this.balanceAmount -= amount;
    }
}
