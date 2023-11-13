/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.Dtos;

import Account.Account;
import java.util.Date;

/**
 *
 * @author rsand
 */
public class TransferDto {
    private Account destination;
    private double amount;
    private Account source;

    public TransferDto(Account destination, double amount, Account source) {
        this.destination = destination;
        this.amount = amount;
        this.source = source;
    }
    
    public Account getDestination() {
        return destination;
    }
}
