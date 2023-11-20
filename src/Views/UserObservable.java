/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Views;

import Person.User;
import Views.Users.UserObserver;

/**
 *
 * @author ´Felipe Chacón
 */
public interface UserObservable {
    void addObserver(UserObserver observer);
    void removeObserver(UserObserver observer);
    void notifyObservers(User user);
}
