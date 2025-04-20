package Association;
import java.util.ArrayList;

public class Human {
    private String name;
    private int age;
    private String id;
    ArrayList <SmartPhone> Phone;

    public Human() {
        
    }



    public  Human(String n, int b, String id) {
        this.name = n;
        this.age = b;
        this.id = id;
    }

    public void SetPhone(ArrayList <SmartPhone> Phone) {
        this.Phone = Phone;
        
    }

    public ArrayList <SmartPhone> getName() {
        return Phone;
    }

    public String toString() {
        return "Name: "+name + " " +"Age: "+ age + " " +"ID "+ id;
    }
}
