import java.util.Scanner;
public class countnoofgrade {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of student : ");
        int numstudent =in.nextInt();
        char[] atoz = new char[numstudent];
        for(int i = 1; i <= numstudent; i++){
            System.out.print("Enter grade of student "+i+" : ");
            atoz[i] = in.next().toLowerCase().charAt(0);
        }
        
        }

    public static void printchar(int n){

    }
}
