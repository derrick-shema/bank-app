package Domain.Shared.BusinessObject;

public class Name {
    public static Name Create(String name) {
        return new Name(name);
    }

    public String getNumber() {
        return name;
    }

    private String name = "";

    private Name(String name) {
        this.name = name;
    }
}
