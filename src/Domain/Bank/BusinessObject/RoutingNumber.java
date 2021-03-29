package Domain.Bank.BusinessObject;

public class RoutingNumber {
    public static RoutingNumber Create(String number) {
        return new RoutingNumber(number);
    }

    public String getNumber() {
        return number;
    }

    private String number = "";

    private RoutingNumber(String number) {
        this.number = number;
    }
}
