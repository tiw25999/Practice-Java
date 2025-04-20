import java.util.Scanner;
public class loop2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num,sum = 0;
            System.out.print("Enter Number: ");
            num = in.nextInt();
            while(num >= 0){
                sum += num;
                System.out.print("Enter Number: ");
                num = in.nextInt();

            }
            System.out.print(""+sum);
        }
        }

