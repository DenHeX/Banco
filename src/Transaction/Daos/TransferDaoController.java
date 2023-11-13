package Transaction.Daos;

import Controller.Controller;
import Views.View;
import java.util.List;

public class TransferDaoController implements Controller<TransferDaoList>{
    private View view;
    private TransferDaoList list;

    @Override
    public boolean create(TransferDaoList obj) {
        return false;
    }

    @Override
    public TransferDaoList read(String id) {
        return null;
    }

    @Override
    public List<TransferDaoList> readAll() {
        return null;
    }

    @Override
    public boolean update(TransferDaoList obj) {
        return false;
    }

    @Override
    public boolean delete(TransferDaoList obj) {
        return false;
    }
    
}
