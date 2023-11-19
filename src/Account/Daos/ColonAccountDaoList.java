package Account.Daos;

import Account.Dtos.AccountDto;
import Account.Dtos.ColonAccountDto;
import java.util.ArrayList;
import java.util.List;

public class ColonAccountDaoList implements Dao<AccountDto> {
    private ArrayList<ColonAccountDto> listColonAccount;
    private static ColonAccountDaoList instance;
    
    private ColonAccountDaoList() {
        listColonAccount = new ArrayList();
    }

     public static ColonAccountDaoList getInstance() {
        if (instance == null) {
            instance = new ColonAccountDaoList();
        }
        return instance;
    }

    @Override
    public boolean create(AccountDto obj) {    
        return false;
    }

    @Override
    public AccountDto read(String id) {
        return null;
    }

    @Override
    public List<AccountDto> readAll() {
        return null;
    }

    @Override
    public boolean update(AccountDto obj) {
        return false;  
    }

    @Override
    public boolean delete(AccountDto obj) {
        return false; 
    }
}
