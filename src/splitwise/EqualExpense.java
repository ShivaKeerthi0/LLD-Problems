package splitwise;
import java.util.List;

public class EqualExpense extends Expense{


    EqualExpense(int id, Group group, User user, int transactionID, ExpenseType expenseType){
        super(id,group,user, transactionID, ExpenseType.EQUAL);
    }

    @Override
    public void split(List<User> users, User paidBy,  double amount[], double percentage[]){
        double splitAmount = amount[0] / (users.size());
        int current_user = -1;
        int paid_user = -1;
        for(User user : users){
            current_user++;
                if(user.getUserID() == paidBy.getUserID()){
                    paid_user = current_user;
                    continue;
                } else {
                    Group group = getGroup();
                    group.getBalanceSheetObj().getSheet()[current_user][paid_user] = splitAmount;
                }
        }
    }


}
