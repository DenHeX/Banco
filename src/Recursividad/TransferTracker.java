/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividad;

import Account.Account;
import Account.Dtos.AccountDto;
import Person.Dtos.CustomerDto;
import Transaction.Dtos.TransferDto;
import Transaction.Transfer;
import java.util.ArrayList;
import java.util.List;

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

    public static List<Transfer> trackCrossCustomerTransfers(List<Transfer> transfers) {
        List<Transfer> crossCustomerTransfers = new ArrayList<>();
        for (Transfer transfer : transfers) {
            trackTransfers(transfer, crossCustomerTransfers);
        }
        return crossCustomerTransfers;
    }

    public static void trackTransfers(Transfer transfer, List<Transfer> crossCustomerTransfers) {
        Account sourceAccount = transfer.getSourceAccount();
        Account destinationAccount = transfer.getDestinationAccount();

        Customer sourceCustomer = sourceAccount.getCustomer();
        Customer destinationCustomer = destinationAccount.getCustomer();

        if (!sourceCustomer.getId().equals(destinationCustomer.getId())) {
            crossCustomerTransfers.add(transfer);
            System.out.println("Transferencia encontrada entre cuentas de diferentes clientes:");
            System.out.println("Transfer ID: " + transfer.getId());
            System.out.println("Origen: " + sourceCustomer.getName() + " - Cuenta: " + sourceAccount.getNumber());
            System.out.println("Destino: " + destinationCustomer.getName() + " - Cuenta: " + destinationAccount.getNumber());
            System.out.println("Monto: " + transfer.getAmount());
        }

        // Llamada recursiva para seguir rastreando transferencias
        List<TransferDto> nextTransfers = getNextTransfers(transfer);
        for (TransferDto nextTransfer : nextTransfers) {
            trackTransfers(nextTransfer, crossCustomerTransfers);
        }
    }

    // Método para obtener las siguientes transferencias relacionadas a una transferencia dada
    public static List<TransferDto> getNextTransfers(TransferDto transfer) {
        // Lógica para obtener las siguientes transferencias basadas en la transferencia actual
        // ...
        return new ArrayList<>();
    }
}
