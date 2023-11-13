
package Person.Daos;

import Controller.Controller;
import Views.View;
import java.util.List;

public class CustomerDaoController implements Controller<CustomerDaoList> {
    
    private View view;
    private CustomerDaoList list;

    @Override
    public boolean create(CustomerDaoList obj) {
        return false;
    }

    @Override
    public CustomerDaoList read(String id) {
        return null;
    }

    @Override
    public List<CustomerDaoList> readAll() {
        return null;
    }

    @Override
    public boolean update(CustomerDaoList obj) {
        return false;
    }

    @Override
    public boolean delete(CustomerDaoList obj) {
        return false;
    }
    
}
