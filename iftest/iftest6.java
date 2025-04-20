import java.util.Scanner;
public class iftest6 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter you Number: ");
        int Number = num.nextInt();
        if (Number >= 10){
            System.out.print("Equal Or More 10");
        }
        else
            System.out.print("Less 10");



    }
}
