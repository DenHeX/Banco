/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaction.Controller;

import Controller.Controller;
import Dao.Dao;
import Transaction.Transaction;
import Transaction.Transfer;
import Transaction.Withdrawal;
import Transaction.Withdrawal;
import Views.View;
import java.util.List;

/**
 *
 * @author ´Felipe Chacón
 */
public class WithdrawalController implements Controller <Withdrawal> {
    private View view;
    private Dao dao;

    public WithdrawalController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }
    
    @Override
    public boolean create(Withdrawal obj) {
       if (dao.create(obj)) {
            view.displayMessage("Retiro registrado con éxito.");
            return true;
        } else {
            view.displayMessage("Error al registrar el retiro.");
            return false;
        }     
    }

    @Override
    public Withdrawal read(String id) {
        Withdrawal transaction = (Withdrawal) dao.read(id);

        if (transaction == null) {
            view.displayMessage("Transacción no encontrada.");
        } else {
            view.display(transaction);
        }
        return transaction;
    }

    @Override
    public List<Withdrawal> readAll() {
        List<Withdrawal> transactions = dao.readAll();

        if (!transactions.isEmpty()) {
            for (Transaction transaction : transactions) {
                view.display(transaction);
            }
            return transactions;
        } else {
            view.displayMessage("No hay transacciones disponibles.");
            return null;
        } 
    }

    @Override
    public boolean update(Withdrawal obj) {
        if (dao.update(obj)) {
            view.displayMessage("Transacción actualizada con éxito.");
            return true;
        } else {
            view.displayMessage("Error al actualizar la transacción.");
            return false;
        } 
    }

    @Override
    public boolean delete(Withdrawal obj) {
        if (dao.delete(obj)) {
            view.displayMessage("Transacción eliminada con éxito.");
            return true;
        } else {
            view.displayMessage("Error al eliminar la transacción.");
            return false;
        }
    }
    
    }
    