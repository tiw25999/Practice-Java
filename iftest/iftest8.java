import java.util.Scanner;
public class iftest8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you Number: ");
        int Number = input.nextInt();
        System.out.print("Enter you Charector: ");
        char Charec = input.next().charAt(0);

        if (Charec == 'a' || Charec == 'A') {
            System.out.print(Number+" Is A");
        }
        else {
            System.out.print(Number+" Not A");
        }
    }
}
