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
public class Transfer extends Transaction {
    private double amount;
    private Account source;
    private Account destination;
    private Date date;

    public Transfer(double amount, Account source, Date date) {
        super(amount, source, date);
    }

    public Transfer(Account destination, double amount, Account source) {
        super(amount, source);
        this.destination = destination;
    }
    
    public Account getDestination() {
        return destination;
    }
    
    @Override
    public boolean execute(){
        return true;
    }
    
    // Método para crear un clon de la transferencia utilizando el patrón Prototype
    @Override
    public Transfer clone() {
        try {
            return (Transfer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Método para guardar el estado de la Transfer utilizando el patrón Memento
    public Transfer saveToMemento() {
        return this.clone();
    }

    // Método para restaurar el estado de la Transfer desde un Memento
    public void restoreFromMemento(Transfer memento) {
        this.amount = memento.getAmount();
        this.source = memento.getSource();
        this.destination = memento.getDestination();
        this.date = memento.getDate();
    }
}

