import java.util.Scanner;

public class method003 {
    static int counta = 0; // Declare counta as a static variable

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grades = new int[6][5]; // Array to store grades for each student and subject

        for (int i = 0; i < 6; i++) {
            System.out.println("Student: " + (i + 1));
            for (int s = 0; s < 5; s++) {
                System.out.print("Subject " + (s + 1) + ": ");
                char grade = in.next().toLowerCase().charAt(0);
                if (grade == 'a') {
                    grades[i][s] = 1;
                } else {
                    grades[i][s] = 0;
                }
            }
        }

        checkSubjectA(grades);
    }

    public static int countA(int[][] grades) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            int countA = 0;
            for (int s = 0; s < 5; s++) {
                countA += grades[i][s];
            }
            if (countA == 5) {
                System.out.println("All A grade for Student " + (i + 1));
            } else if (countA >= 1) {
                System.out.println("One or more A grades for Student " + (i + 1));
            }
            count += countA;
        }
        return count;
    }

    public static void checkSubjectA(int[][] grades) {
        for (int s = 0; s < 5; s++) {
            int countA = 0;
            for (int i = 0; i < 6; i++) {
                countA += grades[i][s];
            }
            if (countA >= 2) {
                System.out.println("At least 2 students received an A grade in Subject " + (s + 1));
            }
        }
    }
}
