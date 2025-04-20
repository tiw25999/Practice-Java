public class Course {
    String CourseID;
    int unit;
    String grade;

    public Course(){

    }

    public Course(String id, int u, String g){
        this.CourseID = id;
        this.unit = u;
        this.grade = g;
    }

    public String getCourseID(){
        return CourseID;
    }

    public int getUnit(){
        return unit;
    }

    public String getGrade(){
        return grade;
    }

    public String toString(){
        return CourseID + " " + unit + " " + grade;
    }
        
    }
