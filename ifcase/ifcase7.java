import java.util.Scanner;
public class ifcase7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you grade(A,B,C,D,F): ");
        char grade = input.next().charAt(0);
        switch(grade){
            case 'a':
            case 'A':
                System.out.print("Grade value: 4");
                break;
            case 'b':
            case 'B':
                System.out.print("Grade value: 3");
                break;
            case 'c':
            case 'C':
                System.out.print("Grade value: 2");
                break;
            case 'd':
            case 'D':
                System.out.print("Garde value: 1");
                break;
            case 'f':
            case 'F':
                System.out.print("Garde value: 0");
                break;
            default:
                System.out.print("An incorrect Grade was entered");
        }
        input.close();
    }
}
