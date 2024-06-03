package splitwise;
import java.util.List;

public class ExactExpense extends Expense{


    ExactExpense(int id, Group group, User user, int transactionID, ExpenseType expenseType){
        super(id,group,user, transactionID, ExpenseType.EXACT);
    }

    @Override
    public void split(List<User> users, User paidBy, double amount[], double percentage[]){
        int current_user = -1;
        int paid_user = -1;
        for(User user : users){
            current_user++;
            if(user.getUserID() == paidBy.getUserID()){
                paid_user = current_user;
                continue;
            } else {
                Group group = getGroup();
                group.getBalanceSheetObj().getSheet()[current_user][paid_user] = amount[current_user];
            }
        }

    }
}
