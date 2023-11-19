/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividad;

import Account.Account;
import Account.Dtos.AccountDto;
import Transaction.Transfer;

/**
 *
 * @author ´Felipe Chacón
 */
public class TransferTracker {
    
    public static void main(String[] args) {
        List<Transfer> transfers = new ArrayList<>();

        transfers.add(new Transfer(new Account("123456"), new Account("789012"), 100.0));
        transfers.add(new Transfer(new Account("789012"), new Account("123456"), 200.0));

        List<Transfer> crossCustomerTransfers = trackCrossCustomerTransfers(transfers);

        for (Transfer transfer : crossCustomerTransfers) {
            System.out.println(transfer);
        }
    }

    public void trackTransfers(TransferDto transfer) {
        AccountDto sourceAccount = accountDao.read(transfer.getSource());
        AccountDto destinationAccount = accountDao.read(transfer.getDestination());

        CustomerDto sourceCustomer = customerDao.read(sourceAccount.getCustomer());
        CustomerDto destinationCustomer = customerDao.read(destinationAccount.getCustomer());

        if (!sourceCustomer.getId().equals(destinationCustomer.getId())) {
            System.out.println("Transferencia encontrada entre cuentas de diferentes clientes:");
            System.out.println("Transfer ID: " + transfer.getId());
            System.out.println("Origen: " + sourceCustomer.getName() + " - Cuenta: " + sourceAccount.getNumber());
            System.out.println("Destino: " + destinationCustomer.getName() + " - Cuenta: " + destinationAccount.getNumber());
            System.out.println("Monto: " + transfer.getAmount());
        }
        
        // Llamada recursiva para seguir rastreando transferencias
        // Dependiendo de cómo esté implementada tu lógica, necesitarás modificar esta parte
        List<TransferDto> nextTransfers = getNextTransfers(transfer);
        for (TransferDto nextTransfer : nextTransfers) {
            trackTransfers(nextTransfer);
        }
    }

    // Método para obtener las siguientes transferencias relacionadas a una transferencia dada
    public List<TransferDto> getNextTransfers(TransferDto transfer) {
        // Lógica para obtener las siguientes transferencias basadas en la transferencia actual
        // ...
    }
}
