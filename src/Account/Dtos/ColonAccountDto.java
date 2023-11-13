package Account.Dtos;

import Person.Customer;

public class ColonAccountDto extends AccountDto {
    
    public ColonAccountDto(String number, double balance, Customer customer) {
        super(number, balance, customer);
    }
    
}
