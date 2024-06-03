package splitwise;

import java.util.List;

public abstract class Expense {

    private int expenseID;
    private Group group;
    public User paidBy;
    public int transactionID;
    public ExpenseType expenseType;

    Expense(int id, Group group, User user, int transactionID, ExpenseType expenseType){
        this.expenseID = id;
        this.group = group;
        this.paidBy = user;
        this.transactionID = transactionID;
        this.expenseType = expenseType;
    }

    public Group getGroup() {
        return group;
    }

    public abstract void split(List<User> users, User paidBy, double amount[], double percentage[]);
}
