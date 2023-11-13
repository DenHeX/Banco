/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person.Controller;

import Controller.Controller;
import Dao.Dao;
import Person.Dtos.UserDto;
import Person.User;
import Views.View;
import java.util.List;

public class UserController implements Controller<User>{
    private View view;
    private Dao dao;

    public UserController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(User user) {
        if (dao.read(user.getId())!=null){
            view.displayMessage("Id de usuario duplicado");
            return false;
        }else{
            UserDto userDto = new UserDto(user.getId(),user.getName(),user.getUsername(), user.getPassword());
            if (dao.create(userDto)){
                view.displayMessage("Usuario agregado correctamente");
                return true;
            }else{
                view.displayMessage("Error al agregar usuario");
                return false;
            }
        }
    }

    @Override
    public User read(String id) {
        UserDto userDto = (UserDto) dao.read(id);
        if(userDto == null){
            view.displayMessage("Id de usuario no encontrado");
        }else{
            User user = new User(userDto.getId(),userDto.getName(),userDto.getUsername(),userDto.getPassword());
            view.display(user);
            return user;
        }
        return null;
    }

    @Override
    public List<User> readAll() {
        return null;
    }

    @Override
    public boolean update(User obj) {
        return false;
    }

    @Override
    public boolean delete(User obj) {
        return false;
    }
    
}
