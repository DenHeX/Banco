package Account.Dtos;

import Person.Customer;

public abstract class AccountDto {
    private String number;
    private double balance;
    private Customer customer;
    private boolean active;

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isActive() {
        return active;
    }

    public AccountDto(String number, double balance, Customer customer) {
        this.number = number;
        this.balance = balance;
        this.customer = customer;
        this.active = true;
    }
}
