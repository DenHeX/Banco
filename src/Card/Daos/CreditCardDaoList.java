package Card.Daos;

import Card.Dtos.CreditCardDto;
import Dao.Dao;
import java.util.HashMap;
import java.util.List;

public class CreditCardDaoList implements Dao <CreditCardDto> {

    private HashMap <String, CreditCardDto> creditcardlist;
    private static CreditCardDaoList instance;

    private CreditCardDaoList() {
        this.creditcardlist = new HashMap();
    }
    
    public static CreditCardDaoList getInstance() {
        if (instance == null) {
            instance = new CreditCardDaoList();
        }
        return instance;
    }
    
    @Override
    public boolean create(CreditCardDto obj) {
        return false;
    }
    
    @Override
    public List<CreditCardDto> readAll() {
        return null;
    }

    @Override
    public boolean update(CreditCardDto obj) {
        return false;
    }

    @Override
    public boolean delete(CreditCardDto obj) {
        return false;
    }

    @Override
    public CreditCardDto read(String id) {
        return null;
    }
    
}
