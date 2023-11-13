package Transaction;

import Account.Account;

public class Deposit extends Transaction {

    public Deposit(double amount, Account source) {
        super(amount, source);
    }

    @Override
    public boolean execute(){
        return true;
    }
}
