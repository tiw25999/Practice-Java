import java.util.Scanner;

public class PhoneNumberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter phone number 1: ");
        String phoneNumber1 = scanner.nextLine();
        PhoneNumber phone1 = new PhoneNumber(phoneNumber1);

        System.out.print("Enter phone number 2: ");
        String phoneNumber2 = scanner.nextLine();
        PhoneNumber phone2 = new PhoneNumber(phoneNumber2);

        System.out.println("We have 2 Phone Numbers");
        System.out.println("Phone number 1 is " + phone1);
        displayDigitSummary(phone1.calFreq());

        System.out.println("Phone number 2 is " + phone2);
        displayDigitSummary(phone2.calFreq());

        scanner.close();
    }

    private static void displayDigitSummary(int[] digitFreq) {
        System.out.println("Digit Summary");
        for (int i = 0; i < digitFreq.length; i++) {
            if (digitFreq[i] > 0) {
                System.out.print(i + " ");
                for (int j = 0; j < digitFreq[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
