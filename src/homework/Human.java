package homework;

public  abstract class Human{

    protected String name;
    public Human (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String toString(){

        return String.format("name = %s",
                name);
    }



}
