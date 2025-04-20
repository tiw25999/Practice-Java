abstract class Course {
    private String CourseID;
    private String grade;
    private int unit;

    // existing constructors and methods...

    public String getCourseID() {
        return CourseID;
    }

    // other getters...
}

public class GenEdCourse extends Course {
    public GenEdCourse() {
        super();
    }

    public GenEdCourse(String id, String g, int u) {
        super(id, g, u);
    }

    public String toString() {
        return getCourseID() + " " + getUnit() + " " + getGrade();
    }
}

public class MajorCourse extends Course {
    private int year;

    // constructors and methods...

    public int getYear() {
        return year;
    }

    public String toString() {
        return getCourseID() + " " + getUnit() + " " + getGrade() + " " + year;
    }
}
