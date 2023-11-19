package Transaction;

import Account.Account;
import java.util.Date;

public class Deposit extends Transaction implements Cloneable {
    private double amount;
    private Account source;
    private Date date;

    public double getAmount() {
        return amount;
    }

    public Account getSource() {
        return source;
    }

    public Date getDate() {
        return date;
    }
    
    public Deposit(double amount, Account source) {
        super(amount, source);
    }
    
    public Deposit(double amount, Account source, Date date) {
        super(amount, source, date);
    }
    
    @Override
    public boolean execute(){
        return true;
    }
    
    // Método para crear un clon del deposito utilizando el patrón Prototype
    @Override
    public Deposit clone() {
        try {
            return (Deposit) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Método para guardar el estado del depósito utilizando el patrón Memento
    public Deposit saveToMemento() {
        return this.clone();
    }

    // Método para restaurar el estado del depósito desde un Memento
    public void restoreFromMemento(Deposit memento) {
    this.amount = memento.getAmount();
    this.source = memento.getSource();
    this.date = memento.getDate();
    }
}
