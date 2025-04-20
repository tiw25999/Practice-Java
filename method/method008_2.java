import java.util.Scanner;
public class method008_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score: ");
        int Score = sc.nextInt();
        char calgarde = garde(Score);
        System.out.println("Grade: " + calgarde);
    }

    public static char garde(int sc) {
        char calgarde;
        if (sc >= 80) {
            calgarde = 'A';
        } else if (sc >= 70) {
            calgarde = 'B';
        } else if (sc >= 60) {
            calgarde = 'C';
        } else if (sc >= 50) {
            calgarde = 'D';
        } else {
            calgarde = 'F';
        }
        return calgarde;
        
    }
}
