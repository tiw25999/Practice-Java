import java.util.Scanner;
public class GradeSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of students: ");
        int N = scanner.nextInt();
        char[] grades = new char[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Please enter grade for Student No. " + (i + 1) + " : ");
            grades[i] = scanner.next().charAt(0);
        }
        int[] gradeCount = new int[5];
        for (int i = 0; i < N; i++) {
            switch (grades[i]) {
                case 'A':
                    gradeCount[0]++;
                    break;
                case 'B':
                    gradeCount[1]++;
                    break;
                case 'C':
                    gradeCount[2]++;
                    break;
                case 'D':
                    gradeCount[3]++;
                    break;
                case 'F':
                    gradeCount[4]++;
                    break;
                default:
                    System.out.println("Invalid grade input.");
            }
        }
        System.out.println("Grade Summary");
        System.out.println("A\tB\tC\tD\tF");
        for (int count : gradeCount) {
            System.out.print(count + "\t");
        }
    }
}