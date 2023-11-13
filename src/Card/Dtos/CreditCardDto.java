/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card.Dtos;

import Card.*;

/**
 *
 * @author ´Felipe Chacón
 */
public class CreditCardDto {
    private double balance;
    private double creditLimit;
    private static double interestRate;

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public CreditCardDto(double balance, double creditLimit) {
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.interestRate = getInterestRate();    
    }

}
