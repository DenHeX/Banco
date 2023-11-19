package Account;

import Person.Customer;

public class ColonAccount extends Account {
    

    public ColonAccount(String number, double balance, Customer customer ) {
        super(number, balance, customer);
    }
   
   
    public ColonAccount(String number, Customer customer) {
        super(number, customer);
    }
    @Override
    public boolean transfer(Account destination, double amount) {
        if (destination instanceof DollarAccount) {
            double exchangeRate = DollarAccount.getExchangeRate();
            double convertedAmount = amount / exchangeRate;

            if (super.transfer(destination, convertedAmount)) {
                return true;
            } else {
                return false; 
            }
        } else {
            return super.transfer(destination, amount);
        }
    }
}
