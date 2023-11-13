package Account.Daos;

import Account.Dtos.AccountDto;
import java.util.HashMap;
import java.util.List;

public class DollarAccountDaoList implements Dao<AccountDto>{
    private HashMap<String,AccountDto> DollarAccountList;
    private static DollarAccountDaoList instance;
    
    public DollarAccountDaoList(){
        DollarAccountList = new HashMap();
    }
    public static DollarAccountDaoList getInstance(){
        if(instance == null){
            instance = new DollarAccountDaoList();
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
