package Transaction.Daos;

import Dao.Dao;
import java.util.HashMap;
import java.util.List;
import Transaction.Dtos.TransferDto;

/**
 *
 * @author ´Felipe Chacón
 */
public class TransferDaoList implements Dao <TransferDto> {
        
    private HashMap <String, TransferDto> transferlist;
    private static TransferDaoList instance;

    public TransferDaoList() {
        this.transferlist = new HashMap();
    }
    public static TransferDaoList getInstance(){
        if(instance == null){
            instance = new TransferDaoList();
        }
        return instance;
    }
    @Override
    public boolean create(TransferDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TransferDto read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TransferDto> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(TransferDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(TransferDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
