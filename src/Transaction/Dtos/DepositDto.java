package Transaction.Dtos;

import Account.Account;
import java.util.Date;

/**
 *
 * @author rsand
 */
public class DepositDto   {
    private double amount;
    private Account source;
    
    public DepositDto(double amount, Account source) {
        this.amount = amount;
        this.source = source;
    }
}
