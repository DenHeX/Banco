/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.Controller;

import Controller.Controller;
import Dao.Dao;
import Transaction.Transaction;
import Views.View;
import java.util.List;

/**
 *
 * @author rsand
 */
public class DepositController implements Controller<Transaction>{
    private View view;
    private Dao dao;

    public DepositController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(Transaction obj) {
    if (dao.create(obj)) {
            view.displayMessage("Depósito registrado con éxito.");
            return true;
        } else {
            view.displayMessage("Error al registrar el depósito.");
            return false;
        }    
    }

    @Override
    public Transaction read(String id) {
        Transaction transaction = (Transaction) dao.read(id);

        if (transaction == null) {
            view.displayMessage("Transacción no encontrada.");
        } else {
            view.display(transaction);
        }

        return transaction;    
    }

    @Override
    public List<Transaction> readAll() {
        List<Transaction> transactions = dao.readAll();

        if (!transactions.isEmpty()) {
            for (Transaction transaction : transactions) {
                view.display(transaction);
            }
            return transactions;
        } else {
            view.displayMessage("No hay transacciones disponibles.");
            return null;
        }    }

    @Override
    public boolean update(Transaction obj) {
        if (dao.update(obj)) {
            view.displayMessage("Transacción actualizada con éxito.");
            return true;
        } else {
            view.displayMessage("Error al actualizar la transacción.");
            return false;
        }    }

    @Override
    public boolean delete(Transaction obj) {
        if (dao.delete(obj)) {
            view.displayMessage("Transacción eliminada con éxito.");
            return true;
        } else {
            view.displayMessage("Error al eliminar la transacción.");
            return false;
        }
    }    
}
