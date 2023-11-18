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
public abstract class Transaction implements Cloneable {
    private double amount;
    private Account source;
    Date date;

    public Transaction(double amount, Account source) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }
    public Transaction(double amount, Account source, Date date) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }

    public Account getSource() {
        return source;
    }

    public Date getDate() {
        return date;
    }
    public abstract boolean execute();
   
// Método para crear un clon de la transacción utilizando el patrón Prototype
    public Transaction cloneTransaction() {
        try {
            return (Transaction) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Método para guardar el estado de la transacción
    public Transaction saveToMemento() {
        return this.cloneTransaction();
    }

    // Método para restaurar el estado de la transacción desde un Memento
    public void restoreFromMemento(Transaction memento) {
        this.amount = memento.getAmount();
        this.source = memento.getSource();
        this.date = memento.getDate();
    }
}
