import java.util.Scanner;
public class loop13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0 , number = 0;
        do{
            System.out.print("Enter number: ");
            number = in.nextInt();
            if(number == -999){
                System.out.print("Sum: = "+sum);
        }else sum += number;
        }while(number != -999);
    }
}
