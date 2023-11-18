/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import Account.Account;
import Card.Card;
import Person.Customer;
import Person.User;
import Transaction.Transaction;
import Transaction.Transfer;
import Transaction.Withdrawal;
import Transaction.Deposit;
import java.util.Date;

    public class BankFacade {
        private FactoryCard cardFactory;
        private FactoryAccount accountFactory;
        private FactoryCustomer customerFactory;
        private FactoryTransaction transactionFactory;
        private FactoryUser userFactory;

        public BankFacade() {
            this.cardFactory = new FactoryCard();
            this.accountFactory = new FactoryAccount();
            this.customerFactory = new FactoryCustomer();
            this.transactionFactory = new FactoryTransaction();
            this.userFactory = new FactoryUser();
        }

        public Card createCard(String number,Account account, double balance, double creditLimit, double interestRate, boolean active, int type) {
            return cardFactory.factory(number, account, balance, creditLimit, interestRate, active, type);
        }

        public Account createAccount(String id, double balance, Customer customer, int type) {
            return accountFactory.factory(id, balance, customer, type);
        }

        public Customer createCustomer(String id, String name, Date dateOfBirth, String phone, String email, String address) {
            return customerFactory.factory(id, name, (java.sql.Date) dateOfBirth, phone, email, address);
        }

        public Transaction createTransaction(double amount, Account source, Account destination, int type) {
            return transactionFactory.factory(amount, source, destination, type);
        }

        public User createUSer(String id, String name, String username, int password) {
            return userFactory.factory(id, name, username, password);
        }

    }

    
    /*Bank bank = new Bank();
    
    bank.crearCliente();
    bank.crearCuenta();
    bank.crearTarjeta();
    bank.crearTransaccion();*/

