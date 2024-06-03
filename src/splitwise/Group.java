package splitwise;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupID;
    private String groupName;
    public List<User> users;
    public List<Transaction> trnx;
    public List<Expense> expenses;
    private int userCount;
    private BalanceSheet balanceSheetObj;

    Group(int id, String groupName, List<User> users, int n){
        this.groupID = id;
        this.groupName = groupName;
        this.users = users;
        this.trnx = new ArrayList(0);
        this.expenses = new ArrayList<>(0);
        this.userCount = n;
        this.balanceSheetObj = new BalanceSheet(n);
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getGroupID() {
        return groupID;
    }

    public List<User> getUsers() {
        return users;
    }

    public String getGroupName() {
        return groupName;
    }

    public BalanceSheet getBalanceSheetObj() {
        return balanceSheetObj;
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void removeUser(int userID){
        for(int i=0;i<users.size();i++){
            if(users.get(i).getUserID() == userID){
                users.remove(i);
            }
        }
    }

    public void addTransaction(Transaction t){
        this.trnx.add(t);
    }

    public void addExpenses(Expense e){
        this.expenses.add(e);
    }



    public void settleDebts(){

       balanceSheetObj.settleDebts();
        
    }
}
