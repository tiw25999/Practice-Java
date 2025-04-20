public class Student1 {
    private String studentID;
    private String name;
    private final Login logins;
    

    

    public Student1(String name, String id, Login l) {
        this.name = name;
        this.studentID = id;
        this.logins = l;
        
    }

    public String getID(){
        return studentID;
    }

    public Login getLogin(){
        return this.logins;
    }

    public String toString(){
        return "Name: "+name +" "+ "ID: " + studentID+ " " + logins;
    }
}
