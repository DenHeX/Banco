package Account.Controller;

import Account.DollarAccount;
import Controller.Controller;
import Dao.Dao;
import Views.View;
import java.util.List;

public class DollarAccountController implements Controller<DollarAccount> {
    
    private View view;
    private Dao dao;

    @Override
    public boolean create(DollarAccount obj) {
        return false;
    }

    @Override
    public DollarAccount read(String id) {
        return null;
    }

    @Override
    public List<DollarAccount> readAll() {
        return null;
    }

    @Override
    public boolean update(DollarAccount obj) {
        return false;
    }

    @Override
    public boolean delete(DollarAccount obj) {
        return false;
    }
            
            
}
