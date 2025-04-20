import java.util.Scanner;

public class CourseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenEdcourse[] id = new GenEdcourse[3];
        MajorCourse[] coeid = new MajorCourse[3];
        id[0] = new GenEdcourse("GEN64-124",4,"D+");
        id[1] = new GenEdcourse("GEN64-183",1,"A");
        id[2] = new GenEdcourse("GEN64-172",2,"C+");
        coeid[0] = new MajorCourse("COE64-211",4,"D",2);
        coeid[1] = new MajorCourse("COE64-212",4,"D",2);
        coeid[2] = new MajorCourse("COE64-322",4,"W",3);
        System.out.println("General Education Courses");
        display(id);
        int count = calPassSubj(id);
        System.out.println("Pass: "+count);
        System.out.println("=======================================================================");
        System.out.println("Major Courses");
        display(coeid);
        int count2 = calPassSubj(coeid);
        System.out.println("Pass: "+count2);
        System.out.println("=======================================================================");
        System.out.println("Enter Course id: ");
        String name = input.next().toUpperCase();
        searchCourse(id,name);
        searchCourse(coeid, name);
        System.out.println("=======================================================================");
        System.out.println("Enter Grade: ");
        String grade = input.next().toUpperCase();
        Seargrade(id, grade);
        Seargrade(coeid, grade);
    }

    public static void display(Course[] id) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(id[i].toString());
            count++;
        }
        System.out.println("Enrol: "+count);
    }

    public static int calPassSubj(Course[] id) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (id[i].getGrade() != "F" && id[i].getGrade() != "W") {
                count++;
            }
        }
        return count;
    }

    public static void searchCourse(Course[] c,String name) {
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            if (c[i].getCourseID().equals(name)) {
            System.out.println(c[i].toString());
            found = true;
        }
    }
    if(!found)
        System.out.println("Course not found");
    }

    public static void Seargrade(Course[] c,String grade){
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            if (c[i].getGrade().equals(grade)) {
            System.out.println(c[i].toString());
            found = true;
        }
    }
    if(!found){
        System.out.println("Course not found");}
}
}
    

