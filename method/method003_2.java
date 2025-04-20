import java.util.Scanner;

public class method003_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grades = new int[6][5];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter grade for Student " + (i + 1) + ", Subject " + (j + 1) + ": ");
                char grade = in.next().toLowerCase().charAt(0);
                grades[i][j] = countA(grade);
            }
        }

        int[] studentsWithAllAs = findStudentsWithAllAs(grades);
        int[] studentsWithAtLeastTwoAs = findStudentsWithAtLeastTwoAs(grades);

        displayStudentNumbers("Students with all 'A' grades: ", studentsWithAllAs);
        displayStudentNumbers("Students with at least two 'A' grades: ", studentsWithAtLeastTwoAs);
    }

    public static int countA(char c) {
        return (c == 'a') ? 1 : 0;
    }

    public static int[] findStudentsWithAllAs(int[][] grades) {
        int[] studentsWithAllAs = new int[grades.length];
        int studentIndex = 0;

        for (int i = 0; i < grades.length; i++) {
            int totalA = 0;
            for (int j = 0; j < grades[i].length; j++) {
                totalA += grades[i][j];
            }
            if (totalA == grades[i].length) {
                studentsWithAllAs[studentIndex] = i + 1;
                studentIndex++;
            }
        }

        return studentsWithAllAs;
    }

    public static int[] findStudentsWithAtLeastTwoAs(int[][] grades) {
        int[] studentsWithAtLeastTwoAs = new int[grades.length];
        int studentIndex = 0;

        for (int i = 0; i < grades.length; i++) {
            int totalA = 0;
            for (int j = 0; j < grades[i].length; j++) {
                totalA += grades[i][j];
            }
            if (totalA >= 2) {
                studentsWithAtLeastTwoAs[studentIndex] = i + 1;
                studentIndex++;
            }
        }

        return studentsWithAtLeastTwoAs;
    }

    public static void displayStudentNumbers(String message, int[] studentNumbers) {
        System.out.print(message);
        for (int i = 0; i < studentNumbers.length; i++) {
            if (studentNumbers[i] > 0) {
                System.out.print(studentNumbers[i]);
                if (i < studentNumbers.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
}
