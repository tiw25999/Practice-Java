import java.util.Scanner;
public class method008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score: ");
        int Score = sc.nextInt();
        garde(Score);
    }

    public static void garde(int sc) {
        char garde;
        if (sc >= 80) {
            garde = 'A';
        } else if (sc >= 70) {
            garde = 'B';
        } else if (sc >= 60) {
            garde = 'C';
        } else if (sc >= 50) {
            garde = 'D';
        } else {
            garde = 'F';
        }
        System.out.println("Grade: " + garde);
        
    }
}
