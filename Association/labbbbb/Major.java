import java.util.ArrayList;

public class Major {
    private String name;
    private ArrayList <Student1> s;


    public Major(String n , ArrayList <Student1> s){
        this.name = n;
        this.s = s;
    }

    public String getName(){
        return name;
    }

    public ArrayList <Student1> getStudent(){
        return s;
    }

    public boolean deleteStudent(Student1 s){

        return true;
    }

    public String toString(){

        return name;
    }


}
