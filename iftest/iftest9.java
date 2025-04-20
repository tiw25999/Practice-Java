import java.util.Scanner;
public class iftest9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you Number: ");
        int Number = input.nextInt();
        System.out.print("Enter you Charector: ");
        char charec = input.next().charAt(0);
        if (charec != 'y' || charec != 'Y') {
            System.out.print(Number+" Not Y");
            
        }
        else {
            System.out.print(Number+" Is Y");
        }
    }
}
