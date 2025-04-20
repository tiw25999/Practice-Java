import java.util.Scanner;
public class QueenContest111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("No. 1 Enter height (e.g., 'f 5 6' or 'c 170'): ");
        char unit1 = input.next().toLowerCase().charAt(0);
        double height1 = input.nextDouble();
        
        System.out.print("No. 2 Enter height (e.g., 'f 5 6' or 'c 170'): ");
        char unit2 = input.next().toLowerCase().charAt(0);
        double height2 = input.nextDouble();

        double cm1, cm2;

        if ((unit1 == 'f' || unit1 == 'c') && (unit2 == 'f' || unit2 == 'c')) {
            if (unit1 == 'f') {
                // Convert height1 to centimeters
                cm1 = (height1 * 12 + input.nextDouble()) * 2.54;
            } else {
                // height1 is already in centimeters
                cm1 = height1;
            }

            if (unit2 == 'f') {
                // Convert height2 to centimeters
                cm2 = (height2 * 12 + input.nextDouble()) * 2.54;
            } else {
                // height2 is already in centimeters
                cm2 = height2;
            }

            if (cm1 > cm2) {
                System.out.println("No. 1 is " + cm1 + " cm and No. 2 is " + cm2 + " cm.");
                System.out.println("No. 1 is taller");
            } else if (cm2 > cm1) {
                System.out.println("No. 1 is " + cm1 + " cm and No. 2 is " + cm2 + " cm.");
                System.out.println("No. 2 is taller");
            } else {
                System.out.println("No. 1 is " + cm1 + " cm and No. 2 is " + cm2 + " cm.");
                System.out.println("They are the same height");
            }
        } else {
            System.out.println("Error: Invalid unit. Please use 'f' for feet and 'c' for centimeters.");
        }
    }
}
