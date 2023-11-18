/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person.Daos;

import Dao.Dao;
import Dao.DaoBD;
import Person.Dtos.UserDto;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rsand
 */
public class UserDaoBD implements Dao<UserDto> {

    @Override
    public boolean create(UserDto obj) {
        if (obj == null) {
            return false;
        }
        DaoBD bd = new DaoBD();
        bd.crateStatement("call UserInsert(?,?,?,?)");
        bd.set(1, obj.getId());
        bd.set(2, obj.getName());
        bd.set(3, obj.getUsername());
        bd.set(4, obj.getPassword());
        return bd.execute(false);

    }

    @Override
    public UserDto read(String id) {
        try {
            DaoBD bd = new DaoBD();
            bd.crateStatement("call UserRead(?)");
            bd.set(1, id);
            if(bd.execute(true));
            if (bd.getData().next()){
             UserDto user = new UserDto(bd.getData().getString(1),bd.getData().getString(2),bd.getData().getString(3),bd.getData().getInt(4));
             return user;
        }else{
                return null;
                }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
      return null;
    }


    @Override
    public List<UserDto> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(UserDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
public boolean delete(UserDto user) {
    DaoBD bd = new DaoBD();
    bd.crateStatement("call UserDelete(?)");
    bd.set(1, user.getId()); // Utiliza el ID dentro de UserDto
    return bd.execute(false); // Cambiar a true si el procedimiento almacenado devuelve un valor o si es necesario verificar el resultado.
}


}





