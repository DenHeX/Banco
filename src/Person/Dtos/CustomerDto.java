/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person.Dtos;

import Person.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author rsand
 */
public class CustomerDto extends Person {
   private Date dateOfBirth; 
   private String phone;  
   private String email;
   private String address;

    public CustomerDto(String id, String name, Date dateOfBirth, String phone, String email, String address ) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
   
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    
    public String getAddress() {
        return address;
    }

}





   
