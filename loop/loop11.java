import java.util.Scanner;
public class loop11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double number = 0, sum = 0;
        for(int count = 0; count < 10;count++){
            System.out.print("Enter number: ");
            number = in.nextDouble();
            sum += number;
        }
        sum /= 10;
        System.out.print("Aver = "+sum);
    }
}
