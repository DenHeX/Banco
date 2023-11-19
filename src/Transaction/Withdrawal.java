/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction;

import Account.Account;
import java.util.Date;

/**
 *
 * @author rsand
 */
public class Withdrawal extends Transaction {
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
    public boolean execute(){
        return true;
    }
    
    // Método para crear un clon del retiro utilizando el patrón Prototype
    @Override
    public Withdrawal clone() {
        try {
            return (Withdrawal) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Método para guardar el estado de la retirada utilizando el patrón Memento
    @Override
    public Withdrawal saveToMemento() {
        return this.clone();
    }

    // Método para restaurar el estado de la retirada desde un Memento
    public void restoreFromMemento(Withdrawal memento) {
    this.amount = memento.getAmount();
    this.source = memento.getSource();
    this.date = memento.getDate();
    }
}

