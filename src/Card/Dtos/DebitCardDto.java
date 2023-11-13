/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card.Dtos;

import Card.*;
import Account.Account;

/**
 *
 * @author ´Felipe Chacón
 */
public class DebitCardDto {
    private Account account;
    private String number;

    public Account getAccount() {
        return account;
    }

    public DebitCardDto(Account account, String number) {
        this.number = number;
        this.account = account;
    }

}
