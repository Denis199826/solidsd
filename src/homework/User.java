package homework;

public class User extends Human implements Report{

    public User(String name) {
        super(name);
    }


    @Override
    public void report() {
        System.out.println("Report for user: " + name);
    }

}
