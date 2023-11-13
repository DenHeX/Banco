/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card;

import Account.Account;

/**
 *
 * @author ´Felipe Chacón
 */

public class DebitCard extends Card{
    private Account account;

    public Account getAccount() {
        return account;
    }


    public DebitCard(Account account, String number) {
        super(number);
        this.account = account;
    }
    
    
    @Override
    public boolean MakePurchase(double amount){
        
    
        if (isActive()   && amount >0 && account != null){
            if(account.withdraw(amount)){
                return true;
            }
        }
        return false;
    }
}
