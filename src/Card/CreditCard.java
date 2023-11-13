package Card;

public class CreditCard extends Card{
    private double balance;
    private double creditLimit;
    private static double interestRate;

    public CreditCard(String number) {
        super(number);
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.interestRate = getInterestRate();
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public static double getInterestRate() {
        return interestRate;
    }
    
    
    @Override
    public boolean MakePurchase(double amount){
        if (isActive() && amount > 0) {
            if (balance + amount <= creditLimit) {
                balance += amount; 
                return true; 
            }
        }
        return false; 
    }

    
    public boolean MakePayment(double amount){
        if (isActive() && amount > 0) {
            if (balance >= amount) {
                balance -= amount; 
                return true; 
            }
        }
        return false;  
    }
}
