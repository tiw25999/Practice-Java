import java.util.Scanner;
public class iftest4 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter you Number: ");
        int Number = num.nextInt();
        if (Number >= 10) {
            System.out.print("Equal OR More 10");
        }
    }
}
