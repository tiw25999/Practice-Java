import java.util.Scanner;

public class iftest7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter: ");
        char charec = num.next().charAt(0); // Read a single character
        if (charec == 'a') { // Use single quotes for characters
            System.out.print("Is A");
        } else {
            System.out.print("Not A");
        }
    }
}
