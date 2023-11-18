/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Controller.Controller;
import Dao.Dao;
import Dao.DaoBD;
import Person.Controller.UserController;
import Person.Daos.UserDaoBD;
import Person.Daos.UserDaoList;
import Person.Dtos.UserDto;
import Person.User;
import Person.Views.UserConsoleView;
import Person.Views.UserFrmView;
import Views.View;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    DaoBD  bd = new DaoBD();
//    bd.crateStatement("call UserReadAll()");
//    //bd.crateStatement("call UserInsert('2','Gerardo','gs','1234')");
//    
//        bd.execute(true);
//    
//        try {
//            while(bd.getData().next()){
//            System.out.println(bd.getData().getString(2));
//        }
//        } catch (SQLException ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

//    UserDto user = new UserDto("3","Ale","ale",1234);
//    UserDaoBD userDao = new UserDaoBD();
//    userDao.create(user);

    //User user = new User("4","Felipe","fp","1234");
    UserDaoBD userDaoBD = new UserDaoBD();
    UserFrmView view = new UserFrmView();
    view.setVisible(true);
    UserController controller = new UserController(view,userDaoBD);
    controller.delete("2");
    }
}
