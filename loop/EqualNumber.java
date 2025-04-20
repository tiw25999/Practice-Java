import java.util.Scanner;
public class EqualNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("no.1: ");
        int num = input.nextInt();
        System.out.print("no.2: ");
        int num2 = input.nextInt();
        System.out.print("no.3: ");
        int num3 = input.nextInt();
        
        if(num == num2 && num2 == num3 && num == num3 ){
            System.out.print("Equal");
        } else System.out.print("Not Equal");
    }

}
