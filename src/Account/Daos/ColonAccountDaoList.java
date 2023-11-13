package Account.Daos;

import Account.Dtos.AccountDto;
import java.util.List;

public class ColonAccountDaoList implements Dao<AccountDto> {

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
