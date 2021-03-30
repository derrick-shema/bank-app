package Domain.Bank.BusinessObject;

public class AccountNumber {
    private String accountNumber = "";

    private AccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static AccountNumber Create (String accountNumber) {
        return new AccountNumber(accountNumber);
    }
}
