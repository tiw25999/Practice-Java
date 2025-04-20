import java.util.Scanner;
public class loop12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        do{
            System.out.print("Enter Number: ");
            int number = in.nextInt();
            sum += Math.pow(number,2);
            System.out.println("Show and Next: "+sum);
        }
        while(sum <= 1000);
        System.out.print("Sum = "+sum);
        }
    }

