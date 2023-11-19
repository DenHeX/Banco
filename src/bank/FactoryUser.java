/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import Person.User;

/**
 *
 * @author ´Felipe Chacón
 */
public class FactoryUser {
    public User factory(String id, String name, String username, int password){
        return new User(id, name, username, password);
    }   
}
