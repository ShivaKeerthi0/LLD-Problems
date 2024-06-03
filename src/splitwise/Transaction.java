package splitwise;

import java.util.Date;

public class Transaction {
    private int transactionID;
    public Date date;
    public User from;
    public User to;
    private double transactionAmount;

    Transaction(int id, Date date, User from, User to, double transactionAmount){
        this.transactionID = id;
        this.date = date;
        this.from =from;
        this.to = to;
        this.transactionAmount = transactionAmount;
    }

}
