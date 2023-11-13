package Account.Dtos;

import Person.Customer;

public class DollarAccountDto extends AccountDto {

    private static double exchangeRate;

    public DollarAccountDto(String number, double balance, Customer customer) {
        super(number, balance, customer);
    }

    public static double getExchangeRate() {
        return exchangeRate;
    }
}
