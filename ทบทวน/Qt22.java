import java.util.Scanner;

public class Qt22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("No.1 Enter: ");
        char con = input.next().toLowerCase().charAt(0);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.print("No.2 Enter: ");
        char con2 = input.next().toLowerCase().charAt(0);
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        input.close();

        if (con == 'f' || con == 'c' && con2 == 'f' || con2 == 'c') {
            if (con == 'f' || con2 == 'f') {
                if (con == 'f' && con2 == 'f') {
                    num1 = num1 * 12;
                    num2 = (num2 + num1) * 2.54;
                    num3 = num3 * 12;
                    num4 = (num4 + num3) * 2.54;
                    if (num2 > num4) {
                        System.out.print("No. 1 is " + num2 + " cm and No. 2 is " + num4 + " cm.");
                        System.out.print("No. 1 is taller");
                    } else if (num4 > num2) {
                        System.out.print("No. 1 is " + num2 + " cm and No. 2 is " + num4 + " cm.");
                        System.out.print("No. 2 is taller");
                    } else if (num2 == num4) {
                        System.out.print("No. 1 is " + num2 + " cm and No. 2 is " + num4 + " cm.");
                        System.out.print(num2 + " = " + num4);
                    }
                } else if (con == 'f' && con2 == 'c') {
                    num1 = num1 * 12;
                    num2 = (num2 + num1) * 2.54;
                    if (num2 > num3) {
                        System.out.print("No. 1 is " + num2 + " cm and No. 2 is " + num3 + " cm.");
                        System.out.print("No. 1 is taller");
                    } else if (num3 > num2) {
                        System.out.print("No. 1 is " + num2 + " cm and No. 2 is " + num3 + " cm.");
                        System.out.print("No. 2 is taller");
                    } else if (num2 == num3) {
                        System.out.print("No. 1 is " + num2 + " cm and No. 2 is " + num3 + " cm.");
                        System.out.print(num2 + " = " + num3);
                    }
                } else if (con == 'c' && con2 == 'f') {
                    num3 = num3 * 12;
                    num4 = (num4 + num3) * 2.54;
                    if (num4 > num1) {
                        System.out.print("No. 1 is " + num4 + " cm and No. 2 is " + num1 + " cm.");
                        System.out.print("No. 1 is taller");
                    } else if (num1 > num4) {
                        System.out.print("No. 1 is " + num4 + " cm and No. 2 is " + num1 + " cm.");
                        System.out.print("No. 2 is taller");
                    } else if (num1 == num4) {
                        System.out.print("No. 1 is " + num4 + " cm and No. 2 is " + num1 + " cm.");
                        System.out.print(num4 + " = " + num1);
                    }
                }
            } else if (con == 'c' && con2 == 'c') {
                if (num1 > num3) {
                    System.out.print("No. 1 is " + num1 + " cm and No. 2 is " + num3 + " cm.");
                    System.out.print("No. 1 is taller");
                } else if (num3 > num1) {
                    System.out.print("No. 1 is " + num1 + " cm and No. 2 is " + num3 + " cm.");
                    System.out.print("No. 2 is taller");
                } else if (num1 == num3) {
                    System.out.print("No. 1 is " + num1 + " cm and No. 2 is " + num3 + " cm.");
                    System.out.print(num1 + " = " + num3);
                }
            }
        }
    }
}
