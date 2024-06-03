package digitalwalletsystem;

import java.util.Date;

public class Transaction {
    User to;
    User from;
    double amount;
    Date startDate;
    Date endDate;
    TransactionStatus status;

    public double getAmount() {
        return amount;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }
}
