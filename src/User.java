public class User {
    private static int lastId = 0;

    private int id;

    private String name;

    private String surname;

    public User(String name, String surname){
        this.id = ++lastId;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
