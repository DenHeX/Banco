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
public abstract class Transaction {
    private double amount;
    private Account source;
    private Date date;

    public Transaction(double amount, Account source) {
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
   
}
