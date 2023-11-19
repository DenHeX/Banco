/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;


import Person.Controller.UserController;
import Person.Daos.UserDaoBD;
import Person.Views.UserFrmView;


/**
 *
 * @author Student
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Dao userDao = new UserDaoList();
//        UserFrmView userView = new UserFrmView();
//        userView.setVisible(true);
//        Controller userController = new UserController(userView,userDao);
//        User user1 = new User("1","Juan","JJ","123");
//        User user2 = new User("2","Felipe","FF","xyz");
//        User user3 = new User("1","María","MM","456");
//        userController.create(user1);
//        userController.create(user2);
//        userController.create(user3);
//        userController.read("2");

//        DaoBD bd = new DaoBD();
//        bd.createStatement("Insert Into users values('2','Felipe','FC','123')");

//        bd.createStatement("call UserInsert('2','Felipe','fp','123')");
//
//        bd.createStatement("call userinsert(?,?,?,?)");
//        
//        bd.set(1,"2");
//        bd.set(2,"Ronny");
//        bd.set(3,"RS");
//        bd.set(4, 123);

//        bd.createStatement("call userreadall(?)");
//
//        //bd.set(1, "1");
//        bd.execute(true);
//
//        try {
//            while(bd.getData().next()){
//                System.out.println(bd.getData().getString(2));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        UserDto user = new UserDto("2", "Felipe", "FC", 123);
//        
//        UserDaoBD userDao = new UserDaoBD();
//        
//        userDao.create(user);

//        User user = new User("1", "Juan", "JP", "qwerty");
        
        UserDaoBD userDaoBD = new UserDaoBD();
        
        UserFrmView view = new UserFrmView();
        
        view.setVisible(true);
        
        UserController controller = new UserController(view ,userDaoBD);
        
        controller.read("2");
    }


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
//    UserDaoBD userDaoBD = new UserDaoBD();
//    UserFrmView view = new UserFrmView();
//    view.setVisible(true);
//    UserController controller = new UserController(view,userDaoBD);
//    controller.delete("2");
//    }

}
