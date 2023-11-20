/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person.Daos;

import Dao.DaoBD;
import Dao.Dao;
import Person.Dtos.UserDto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * UserDaoBD class for handling UserDto objects in a database.
 */
public class UserDaoBD implements Dao<UserDto> {

    @Override
    public boolean create(UserDto obj) {
        if (obj == null) {
            return false;
        }

        DaoBD bd = new DaoBD();
        bd.crateStatement("call userinsert(?,?,?,?)");

        bd.set(1, obj.getId());
        bd.set(2, obj.getName());
        bd.set(3, obj.getUsername());
        bd.set(4, obj.getPassword());

        return bd.execute(false);
    }

    @Override
    public UserDto read(String id) {
        DaoBD bd = new DaoBD();
        bd.crateStatement("call userread(?)");
        bd.set(1, id);

        if (bd.execute(true)) {
            try {
                if (bd.getData().next()) {
                    return new UserDto(
                            bd.getData().getString(1),
                            bd.getData().getString(2),
                            bd.getData().getString(3),
                            bd.getData().getInt(4)
                    );
                } else {
                    return null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public List<UserDto> readAll() {
        DaoBD bd = new DaoBD();
        bd.crateStatement("call userreadall()"); // Assuming you have a stored procedure for reading all users

        List<UserDto> userList = new ArrayList<>();

        if (bd.execute(true)) {
            try {
                while (bd.getData().next()) {
                    UserDto user = new UserDto(
                            bd.getData().getString(1),
                            bd.getData().getString(2),
                            bd.getData().getString(3),
                            bd.getData().getInt(4)
                    );
                    userList.add(user);
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return userList;
    }

    @Override
    public boolean update(UserDto obj) {
        if (obj == null) {
            return false;
        }

        DaoBD bd = new DaoBD();
        bd.crateStatement("call userupdate(?,?,?,?)"); // Assuming you have a stored procedure for updating a user

        bd.set(1, obj.getId());
        bd.set(2, obj.getName());
        bd.set(3, obj.getUsername());
        bd.set(4, obj.getPassword());

        return bd.execute(false); // Change to true if the stored procedure returns a value or if result verification is necessary.
    }

    @Override
    public boolean delete(UserDto obj) {
        DaoBD bd = new DaoBD();
        bd.crateStatement("call UserDelete(?)");
        bd.set(1, obj.getId()); // Use the ID within UserDto
        return bd.execute(false); // Change to true if the stored procedure returns a value or if result verification is necessary.
    }
}
