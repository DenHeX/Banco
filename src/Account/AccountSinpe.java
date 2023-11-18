/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;


public class AccountSinpe {

    private Account account;

    public AccountSinpe(Account account) {
        this.account = account;
    }

    public boolean hacerPago(double amount) {
        if (amount > 0 && account.getBalance() >= amount) {
            return account.withdraw(amount);
        } else {
            return false;
        }
    }

    public boolean recibirPago(double amount) {
        if (amount > 0) {
            return account.deposit(amount);
        } else {
            return false;
        }
    }
}