/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import Account.Account;
import Account.ColonAccount;
import Account.DollarAccount;
import Person.Customer;

/**
 *
 * @author ´Felipe Chacón
 */
public class FactoryAccount {
    public Account factory(String id, double balance, Customer customer, int type){
        if (type ==1){
            return new ColonAccount(id, balance, customer);
        }else{
            return new DollarAccount(id, balance, customer);
        }
    }
    
}
