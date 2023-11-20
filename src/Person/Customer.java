package Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Customer extends Person {

    private Date dateOfBirth;
    private String phone;
    private String email;
    private String address;

    public Customer(String id, String name, String dateOfBirth, String phone, String email, String address) {
        super(id, name);
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            this.dateOfBirth = new Date(dateFormat.parse(dateOfBirth).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Customer(Date dateOfBirth, String email, String address, String id, String name) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.phone = "";
        this.email = email;
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return calculateAge();
    }
    public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}

    private int calculateAge() {
        LocalDate birthDate = dateOfBirth.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}






   
