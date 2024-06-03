package digitalwalletsystem;

import java.util.Currency;
import java.util.List;
//Singleton class
public class DigitalWalletSystem {
    List<Transaction> transactionList;
    List<User> users;
    PaymentService paymentServiceObj;
    CurrencyConverter currencyConverterObj;


    public List<User> getUsers() {
        return users;
    }
    public void registerUser(User user) {
        users.add(user);
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void transferAmount(User to, User from, double amount, PaymentMethod paymentMethod ){
       try{
           if(to.bankAccountList.get(0).currency!= from.bankAccountList.get(0).currency){
               currencyConverterObj.convertCurrency(to.bankAccountList.get(0).currency, from.bankAccountList.get(0).currency, amount);
           }
           if(paymentMethod.equals(PaymentMethod.UPI)){
               paymentServiceObj = new UPIStrategy();
               paymentServiceObj.makePayment(to, from, amount,null, "");

           } else {
               paymentServiceObj = new CreditCardStrategy();
               paymentServiceObj.makePayment(to, from, amount, to.creditCards.get(0), null);
           }
       }catch (Exception ex){
           System.out.println(ex.getCause());
       } finally {
           logTransaction(to, from, amount);
       }



    }

    public void logTransaction(User to, User from, double amount){
        // creates transaction and adds to list of transactions
    }
}
