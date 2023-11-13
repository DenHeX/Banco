
package Account.Controller;

import Account.Account;
import Controller.Controller;
import Dao.Dao;
import Views.View;
import java.util.List;

/**
 *
 * @author rsand
 */
public class CollonAccountController implements Controller<Account> {
    private View view;
    private Dao dao;

    public CollonAccountController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }
    @Override
    public boolean create(Account obj) {
    List<Account> existingAccounts = dao.readAll();
    
    for (Account account : existingAccounts) {
        if (account.getNumber().equals(obj.getNumber())) {
            view.displayMessage("Número de cuenta duplicado");
            return false;
        }
    }
    
    if (dao.create(obj)) {
        view.displayMessage("Cuenta creada con éxito.");
        return true;
    } else {
        view.displayMessage("Error al crear la cuenta.");
        return false;
    }
    }

    @Override
    public Account read(String id) {
         Account account = (Account) dao.read(id);
    
    if (account == null) {
        view.displayMessage("Cuenta no encontrada.");
    } else {
        view.display(account);
    }
    
    return account;
    }

    @Override
    public List<Account> readAll() {
         List<Account> accounts = dao.readAll();
    
    if (!accounts.isEmpty()) {
        for (Account account : accounts) {
            view.display(account);
        }
        return accounts;
    } else {
        view.displayMessage("No hay cuentas disponibles.");
        return null;
    }
    }

    @Override
    public boolean update(Account obj) {
         if (dao.update(obj)) {
        view.displayMessage("Cuenta actualizada con éxito.");
        return true;
    } else {
        view.displayMessage("Error al actualizar la cuenta.");
        return false;
    }
    }

    @Override
    public boolean delete(Account obj) {
        if (dao.delete(obj)) {
        view.displayMessage("Cuenta eliminada con éxito.");
        return true;
    } else {
        view.displayMessage("Error al eliminar la cuenta.");
        return false;
    }
    }
    
}
