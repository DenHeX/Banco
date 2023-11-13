package Account;

import Person.Customer;

public class DollarAccount extends Account {
    
    public DollarAccount(String number, double balance, Customer customer) {
        super(number, balance, customer);
    }
    private static double exchangeRate;

    public DollarAccount(String number, double balance, Customer customer, double exchangeRate) {
        super(number, balance, customer);
        setExchangeRate(exchangeRate);
    }
   

    public DollarAccount(String number, Customer customer) {
        super(number, customer);
    }

    public static double getExchangeRate() {
        return exchangeRate;
    }

    public static void setExchangeRate(double exchangeRate) {
        DollarAccount.exchangeRate = exchangeRate;
    }
    
    public boolean transfer(Account destination, double amount) {
        if (destination instanceof ColonAccount) {
            double exchangeRate = getExchangeRate();
            double convertedAmount = amount * exchangeRate;

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
