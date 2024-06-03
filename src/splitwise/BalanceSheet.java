package splitwise;
import java.util.ArrayList;
import java.util.List;

public class BalanceSheet {
    private double[][] balanceSheet;
    List<User> users;
    BalanceSheet(int n){
        balanceSheet = new double[n][n];
    }

    public void calculateBalanceForEachEser(){
        for(int i =0 ;i<balanceSheet.length; i++){
           double value =  getBalanceForUser(users.get(i));
           System.out.println("User "+ i + " balance is : "+ value);
        }
    }

    private double getBalanceForUser(User user){
       double toGiveAmount =0;
       double toReceiveAmount = 0;
       for(int i =0; i<balanceSheet.length;i++){
           toGiveAmount+=balanceSheet[user.getUserID()][i];
       }
        for(int i =0; i<balanceSheet.length;i++){
            toReceiveAmount+=balanceSheet[i][user.getUserID()];
        }

        return toReceiveAmount - toGiveAmount;
    }

    public double[][] getSheet() {
        return balanceSheet;
    }


    public void settleDebts() {
        List<User> positiveBalances = new ArrayList<>();
        List<User> negativeBalances = new ArrayList<>();

        for (User user : users) {
            double balance = getBalanceForUser(user);
            if (balance > 0) {
                positiveBalances.add(user);
            } else if (balance < 0) {
                negativeBalances.add(user);
            }
        }

        positiveBalances.sort((a, b) -> Double.compare(getBalanceForUser(b), getBalanceForUser(a)));
        negativeBalances.sort((a, b) -> Double.compare(getBalanceForUser(a), getBalanceForUser(b)));

        int i = 0, j = 0;
        while (i < positiveBalances.size() && j < negativeBalances.size()) {
            User creditor = positiveBalances.get(i);
            User debtor = negativeBalances.get(j);

            double amount = Math.min(getBalanceForUser(creditor), -getBalanceForUser(debtor));
            System.out.println(debtor.getName() + " owes " + creditor.getName() + ": " + amount);

            updateBalance(creditor, debtor, amount);

            if (getBalanceForUser(creditor) == 0) i++;
            if (getBalanceForUser(debtor) == 0) j++;
        }
    }

    private void updateBalance(User creditor, User debtor, double amount) {
        int creditorId = creditor.getUserID();
        int debtorId = debtor.getUserID();

        // Creditor gives amount, so reduce amount from debtor to creditor
        balanceSheet[debtorId][creditorId] -= amount;
        // Debtor receives amount, so increase amount from debtor to creditor
        balanceSheet[creditorId][debtorId] += amount;
    }
}
