public class Bank {
    private static int lastId = 0;

    private int id;

    private String name;

    private String currency;

    public Bank(String name, String currency) {
        this.id = ++lastId;
        this.name = name;
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }
}
