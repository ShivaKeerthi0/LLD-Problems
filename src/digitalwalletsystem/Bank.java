package digitalwalletsystem;

import java.util.List;

public class Bank {
    int bankId;
    String bankName;
    List<BankAccount> bankAccountList;
    List<User> userList;
    String IFSCCode;
    List<Transaction> transactions;

    public int getBankId() {
        return bankId;
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public String getBankName() {
        return bankName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void userDetails(Account account){

    }

    public String getIFSCCode() {
        return IFSCCode;
    }
}
