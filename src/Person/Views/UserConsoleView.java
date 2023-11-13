package Person.Views;

import Person.User;
import Views.View;

public class UserConsoleView implements View<User> {

    @Override
    public void display(User user) {
        System.out.println("Id: "+user.getId());
        System.out.println("Nombre: "+user.getName());
        System.out.println("Nombre de usuario: "+user.getUsername());
    }

    @Override
    public void displayMessage(String msg) {
        System.out.println(msg);
    }

}
