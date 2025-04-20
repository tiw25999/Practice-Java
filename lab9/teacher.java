public class teacher {
    String name;
    char gender;
    int age;

    public teacher(){
    }

    public teacher(String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public char getGender(){
        return gender;
    }

    public String toString(){
        return name + "," + gender + "," + age ;
    }
}