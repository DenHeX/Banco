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

    public Withdrawal(double amount, Account source) {
        super(amount, source);
    }
    
    @Override
    public boolean execute(){
        return true;
    }
}
