/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import Account.Account;
import Card.Card;
import Card.CreditCard;
import Card.DebitCard;

public class FactoryCard {
    public Card factory(String number,Account account, double balance, double creditLimit, double interestRate, boolean active, int type) {
        if (type == 1) {
            return new CreditCard(number, balance, creditLimit, interestRate, active);
        } else {
            return new DebitCard(account, number, active);
        }
    }
}
