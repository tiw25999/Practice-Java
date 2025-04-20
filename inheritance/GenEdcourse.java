public class GenEdcourse extends Course{
    public GenEdcourse(){
        
    }
    public GenEdcourse(String id, int u, String g){
        super(id,u,g);
    }
    public String toString(){
        return CourseID + " " + unit + " " + grade;
    }
    
}
