public class MajorCourse extends Course{
    protected int year;
    public MajorCourse(){
        
    }
    public MajorCourse(String id, int u, String g, int y){
        super(id, u, g);
        this.year = y;
    }
    public getYear(){
        return year;
    }

    public String toString(){
        return CourseID + " " + unit + " " + grade + " " + year;
    }
}
