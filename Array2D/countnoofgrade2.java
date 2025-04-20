import java.util.Scanner;

public class countnoofgrade2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of student : ");
        int numstudent =in.nextInt();
        char[] atoz = new char[numstudent];
        for(int i = 0; i < numstudent; i++){
            System.out.print("Enter grade of student "+(i+1)+" : ");
            atoz[i] = in.next().toLowerCase().charAt(0);
        }
        
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;
        for (int i = 0; i < numstudent; i++) {
            switch (atoz[i]) {
                case 'a': countA++; break;
                case 'b': countB++; break;
                case 'c': countC++; break;
                case 'd': countD++; break;
                case 'f': countF++; break;
            }
        }
        System.out.print("A: ");
        printchar(countA);
        System.out.print("B: ");
        printchar(countB);
        System.out.print("C: ");
        printchar(countC);
        System.out.print("D: ");
        printchar(countD);
        System.out.print("F: ");
        printchar(countF);
    }

    public static void printchar(int n){
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
