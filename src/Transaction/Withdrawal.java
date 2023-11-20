/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction;

import Account.Account;
import java.util.Date;

public class Withdrawal extends Transaction implements Cloneable {

    private double amount;
    private Account source;
    private Date date;

    public Withdrawal(double amount, Account source) {
        super(amount, source);
    }

    public Withdrawal(double amount, Account source, Date date) {
        super(amount, source, date);
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public Account getSource() {
        return source;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public boolean execute() {
        // Your withdrawal execution logic goes here
        return true;
    }

    // Method to create a clone of the withdrawal using the Prototype pattern
    @Override
    public Withdrawal clone() {
        try {
            return (Withdrawal) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to save the state of the withdrawal using the Memento pattern
    @Override
    public Withdrawal saveToMemento() {
        return this.clone();
    }

    // Method to restore the state of the withdrawal from a Memento
    public void restoreFromMemento(Withdrawal memento) {
        this.amount = memento.getAmount();
        this.source = memento.getSource();
        this.date = memento.getDate();
    }
}
