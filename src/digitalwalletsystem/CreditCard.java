package digitalwalletsystem;

import java.util.Date;

public class CreditCard {
    int id;
    String cardNumber;
    int cvv;
    Date exipryDate;

    public Date getExipryDate() {
        return exipryDate;
    }

    public int getCvv() {
        return cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
