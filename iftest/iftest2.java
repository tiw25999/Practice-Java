import java.util.Scanner;

public class iftest2 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter you Number: ");
        int Number = num.nextInt();
        if (Number < 10){
            System.out.println("Less 10");
        }
    }
}
