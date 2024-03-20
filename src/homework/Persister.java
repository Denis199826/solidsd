package homework;

import javax.xml.namespace.QName;

public class Persister extends Human {


    public Persister(String name) {
        super(name);
    }

    public void save(){
        System.out.println("Save human: " + name);
    }

}
