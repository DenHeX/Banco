package Transaction.Daos;

import Dao.Dao;
import Person.Dtos.UserDto;
import Transaction.Dtos.WithdrawalDto;
import java.util.HashMap;
import java.util.List;

public class WithdrawalDaoList implements Dao<WithdrawalDto>{
    
     private HashMap<String,UserDto> withdrawalList;
     private static WithdrawalDaoList instance;

    private WithdrawalDaoList() {
        withdrawalList = new HashMap();
    }
    
    public static WithdrawalDaoList getInstance() {
        if (instance == null) {
            instance = new WithdrawalDaoList();
        }
        return instance;
    }

    @Override
    public boolean create(WithdrawalDto obj) {
         return false;
    }

    @Override
    public WithdrawalDto read(String id) {
         return null;
    }

    @Override
    public List<WithdrawalDto> readAll() {
         return null;
    }

    @Override
    public boolean update(WithdrawalDto obj) {
         return false;
    }

    @Override
    public boolean delete(WithdrawalDto obj) {
         return false;
    }

}