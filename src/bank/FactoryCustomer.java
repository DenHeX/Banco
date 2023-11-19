/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import Person.Customer;
import java.sql.Date;

/**
 *
 * @author ´Felipe Chacón
 */
public class FactoryCustomer {
    public Customer factory(String id, String name, Date dateOfBirth, String phone, String email, String address){
        return new Customer(id, name, dateOfBirth, phone, email, address);
    }
}
