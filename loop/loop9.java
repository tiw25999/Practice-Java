import java.util.Scanner;
public class loop9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num: ");
        int number = in.nextInt();
        int count = 0,sum = 0;
        System.out.println("Number = "+number);
        while(count < 9){
            if(number >= 0){
            sum += number + number;
            System.out.println("Number = "+sum);
            count++;}
        }
    }
}
