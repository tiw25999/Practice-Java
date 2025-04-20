import java.util.ArrayList;
import java.util.Scanner;

public class PolymorphismCourse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Course> id = new ArrayList<Course>();
        id.add(new GenEdcourse("GEN64-124",4,"D+"));
        id.add(new GenEdcourse("GEN64-183",1,"A"));
        id.add(new GenEdcourse("GEN64-172",2,"C+"));
        id.add(new MajorCourse("COE64-211",4,"D",2));
        id.add(new MajorCourse("COE64-212",4,"D",2));
        id.add(new MajorCourse("COE64-322",4,"W",3));
        System.out.println("General Education Courses");
        display(id);
        int count = calPassSubj(id);
        System.out.println("Pass: "+count);
        System.out.println("=======================================================================");
        System.out.println("Major Courses");
        display2(id);
        int count2 = calPassSubj2(id);
        System.out.println("Pass: "+count2);
        System.out.println("=======================================================================");
        System.out.println("Enter Course id: ");
        String name = input.next().toUpperCase();
        searchCourse(id,name);
        searchCourse(id, name);
        System.out.println("=======================================================================");
        double result = calGPA(id);
        System.out.println("GPA: "+result);
        System.out.println("=======================================================================");
        System.out.println("Enter Grade: ");
        String grade = input.next().toUpperCase();
        Seargrade(id, grade);
        Seargrade(id, grade);
    }

    public static void display(ArrayList<Course> id) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(id.get(i).toString());
            count++;
        }
        System.out.println("Enrol: "+count);
    }

    public static void display2(ArrayList<Course> id) {
        int count = 0;
        for (int i = 3; i < 6; i++) {
            System.out.println(id.get(i).toString());
            count++;
        }
        System.out.println("Enrol: "+count);
    }

    public static double calGPA(ArrayList<Course> id) {
        double sum = 0;
        double unit = 0;
        double result = 0;
        for(int i = 0; i < id.size(); i++) {
            if(id.get(i).getGrade().equals("A")){
                sum += 4;
                unit += id.get(i).getUnit();
            }
            else if(id.get(i).getGrade().equals("B+")){
                sum += 3.5;
                unit += id.get(i).getUnit();
            }
            else if(id.get(i).getGrade().equals("B")){
                sum += 3;
                unit += id.get(i).getUnit();
            }
            else if(id.get(i).getGrade().equals("C+")){
                sum += 2.5;
                unit += id.get(i).getUnit();
            }
            else if(id.get(i).getGrade().equals("C")){
                sum += 2;
                unit += id.get(i).getUnit();
            }else {
                sum += 0;
                unit += id.get(i).getUnit();
            }}
                return result = sum/15;
            }

    public static int calPassSubj(ArrayList<Course> id) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (!id.get(i).getGrade().equals("F") && !id.get(i).getGrade().equals("W")) {
                count++;
            }
        }
        return count;
    }

    public static int calPassSubj2(ArrayList<Course> id) {
        int count = 0;
        for (int i = 3; i < 6; i++) {
            if (!id.get(i).getGrade().equals("F") && !id.get(i).getGrade().equals("W")) {
                count++;
            }
        }
        return count;
    }

    public static void searchCourse(ArrayList<Course> c,String name) {
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            if (c.get(i).getCourseID().equals(name)) {
            System.out.println(c.get(i).toString());
            found = true;
        }
    }
    if(!found)
        System.out.println("Course not found");
    }

    public static void Seargrade(ArrayList<Course> c,String grade){
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            if (c.get(i).getGrade().equals(grade)) {
            System.out.println(c.get(i).toString());
            found = true;
        }
    }
    if(!found){
        System.out.println("Course not found");}
}
}
    

